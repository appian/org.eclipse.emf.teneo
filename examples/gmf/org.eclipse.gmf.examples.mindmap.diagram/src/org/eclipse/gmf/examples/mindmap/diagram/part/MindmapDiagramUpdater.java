package org.eclipse.gmf.examples.mindmap.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.examples.mindmap.Map;
import org.eclipse.gmf.examples.mindmap.MindmapPackage;
import org.eclipse.gmf.examples.mindmap.Topic;
import org.eclipse.gmf.examples.mindmap.diagram.edit.parts.MapEditPart;
import org.eclipse.gmf.examples.mindmap.diagram.edit.parts.TopicEditPart;
import org.eclipse.gmf.examples.mindmap.diagram.edit.parts.TopicSubtopicsEditPart;
import org.eclipse.gmf.examples.mindmap.diagram.providers.MindmapElementTypes;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class MindmapDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (MindmapVisualIDRegistry.getVisualID(view)) {
		case MapEditPart.VISUAL_ID:
			return getMap_79SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMap_79SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Map modelElement = (Map) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getRootTopics().iterator(); it
				.hasNext();) {
			Topic childElement = (Topic) it.next();
			int visualID = MindmapVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TopicEditPart.VISUAL_ID) {
				result.add(new MindmapNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (MindmapVisualIDRegistry.getVisualID(view)) {
		case MapEditPart.VISUAL_ID:
			return getMap_79ContainedLinks(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_1001ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (MindmapVisualIDRegistry.getVisualID(view)) {
		case TopicEditPart.VISUAL_ID:
			return getTopic_1001IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (MindmapVisualIDRegistry.getVisualID(view)) {
		case TopicEditPart.VISUAL_ID:
			return getTopic_1001OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMap_79ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTopic_1001ContainedLinks(View view) {
		Topic modelElement = (Topic) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Topic_Subtopics_3001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTopic_1001IncomingLinks(View view) {
		Topic modelElement = (Topic) view.getElement();
		java.util.Map crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Topic_Subtopics_3001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTopic_1001OutgoingLinks(View view) {
		Topic modelElement = (Topic) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Topic_Subtopics_3001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Topic_Subtopics_3001(
			Topic target, java.util.Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == MindmapPackage.eINSTANCE
					.getTopic_Subtopics()) {
				result.add(new MindmapLinkDescriptor(setting.getEObject(),
						target, MindmapElementTypes.TopicSubtopics_3001,
						TopicSubtopicsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Topic_Subtopics_3001(
			Topic source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getSubtopics().iterator(); destinations
				.hasNext();) {
			Topic destination = (Topic) destinations.next();
			result.add(new MindmapLinkDescriptor(source, destination,
					MindmapElementTypes.TopicSubtopics_3001,
					TopicSubtopicsEditPart.VISUAL_ID));
		}
		return result;
	}

}
