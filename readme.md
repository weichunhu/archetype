1、clone from https://github.com/weichunhu/archetype.git\r\n
2、mvn clean deploy -Dmaven.test.skip=true
3、mvn archetype:generate -DgroupId=com.cache -DartifactId=cache -Dversion=1.0-SNAPSHOT -Dpackage=com.cache -DarchetypeGroupId=com.archetype -DarchetypeArtifactId=archetype-parent -DarchetypeVersion=1.0-SNAPSHOT -X -DarchetypeCatalog=[local|remote]

comment:
groupId : project groupId
artifactId : project artifactId
version : project version
package : project package or default

archetype config
archetypeGroupId : archetype groupId
archetypeArtifactId : archetype artifactId
DarchetypeVersion : archetype version
archetypeCatalog : local or remote
