package org.eclipse.emf.teneo.hibernate.hbannotation.util;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.teneo.annotations.pannotation.util.EAnnotationImporter;
import org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage;

/**
 * This class interprets the annotation importing process based on the
 * hibernate.elver.org annotation model. The main difference between this and
 * EAnnotationImporter is that this class understands that hibernate annotations
 * begin with http://hibernate.elver.org/.
 */
public class HbAnnotationImporter extends EAnnotationImporter {

    public HbAnnotationImporter(Handler handler) {
        super(handler);
    }

    private final boolean isHbAnnotation(EAnnotation eAnnotation) {
        return isHbAnnotation(eAnnotation.getSource());
    }

    private final boolean isHbAnnotation(final String source) {
        return null != getHbPrefix(source);
    }

    protected EClass getElverAnnotationEClass(EAnnotation eAnnotation) {
        return (isHbAnnotation(eAnnotation)) ? getEClass(eAnnotation
                .getSource(), getHbPrefix(eAnnotation.getSource()),
                HbAnnotationPackage.eINSTANCE) : super
                .getElverAnnotationEClass(eAnnotation);
    }

    protected String getElverSubordinateId(EAnnotation eAnnotation) {
        return (isHbAnnotation(eAnnotation)) ? getSubordinateId(eAnnotation,
                getHbPrefix(eAnnotation.getSource())) : super
                .getElverSubordinateId(eAnnotation);
    }

    protected boolean isElverAnnotationSource(String source) {
        return (isHbAnnotation(source) || super.isElverAnnotationSource(source));
    }

    protected boolean isElverSubordinate(EAnnotation eAnnotation) {
        final String prefix = getPrefix(eAnnotation.getSource());
        if (isHbAnnotation(eAnnotation)) {
            String annotationName =
                    eAnnotation.getSource().substring(prefix.length());
            return annotationName.indexOf('/') != -1;
        }
        return super.isElverSubordinate(eAnnotation);
    }

    protected String getPrefix(String source) {
        String result = getHbPrefix(source);
        return (null == result) ? super.getPrefix(source) : result;
    }

    private String getHbPrefix(String source) {
        if (source == null) {
            return null;
        }
        final Collection prefixes =
                HbAnnotationPackage.eINSTANCE.getEAnnotation(
                        "teneo.mapping.source").getDetails().values();
        for (Iterator iter = prefixes.iterator(); iter.hasNext();) {
            String prefix = (String) iter.next();
            if (source.startsWith(prefix)) {
                return prefix;
            }
        }
        return null;
    }
}
