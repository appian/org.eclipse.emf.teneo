cd /home/mtaal/mydownloads
rm -rf mavendownload
mkdir mavendownload
cd mavendownload
wget https://hudson.eclipse.org/hudson/job/emf-teneo-nightly/ws/build/result/maven/*zip*/maven.zip
unzip maven.zip

mvn gpg:sign-and-deploy-file -Durl=https://oss.sonatype.org/service/local/staging/deploy/maven2/ -DrepositoryId=sonatype-nexus-snapshots -DpomFile=blabla.pom -Dfile=blabla.jar
mvn gpg:sign-and-deploy-file -Durl=https://oss.sonatype.org/service/local/staging/deploy/maven2/ -DrepositoryId=sonatype-nexus-staging -DpomFile=ossrh-test-1.2.pom -Dfile=ossrh-test-1.2-sources.jar -Dclassifier=sources


