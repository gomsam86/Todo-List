# Todo-List

Description
Imagine that you have a supply of protein bars and you want to present these bars to potential customers to make it easier for them to reach their nutritional goals. Some of them might be interested in eating as much protein as they can (bodybuilders, I guess) and some of them might be interested in eating carbohydrates as well and so on. Your job is to make an application that will assist the customers in choosing the right product. At your disposal you have the information about the protein bars represented in an XML file bars.xml.

The project keeps track of the tasks that the user wants to do and the tasks finished by him. It provides the facilities of adding, saving, listing, editing and removing the task from task list. A short description of various options are:

Adding a task:

While adding a new task, it requires the information like title, project, due date, status etc. An id is also generated for every task.

Saving a task:

This option deals with persistence of data. The user may save the task to file and retrieve also.

Listing of tasks:

The user can also see the list of tasks. The tasks list can be filtered by the project name or sorted by the date.

Editing a task:

The user can mark the task as done.

Remove a task:

The user can remove the task by task id


XML file

The XML file structure looks similar to this:
<?xml version="1.0" encoding="UTF-8"?>
<module type="JAVA_MODULE" version="4">
  <component name="NewModuleRootManager" inherit-compiler-output="true">
    <exclude-output />
    <content url="file://$MODULE_DIR$">
      <sourceFolder url="file://$MODULE_DIR$/src" isTestSource="false" />
      <sourceFolder url="file://$MODULE_DIR$" isTestSource="false" />
      <sourceFolder url="file://$MODULE_DIR$/test" isTestSource="true" />
    </content>
    <orderEntry type="inheritedJdk" />
    <orderEntry type="sourceFolder" forTests="false" />
    <orderEntry type="module-library">
      <library name="JUnit4">
        <CLASSES>
          <root url="jar://$MAVEN_REPOSITORY$/junit/junit/4.12/junit-4.12.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar!/" />
        </CLASSES>
        <JAVADOC />
        <SOURCES />
      </library>
    </orderEntry>
    <orderEntry type="module-library">
      <library name="JUnit5.4">
        <CLASSES>
          <root url="jar://$MAVEN_REPOSITORY$/org/junit/jupiter/junit-jupiter/5.4.2/junit-jupiter-5.4.2.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/junit/jupiter/junit-jupiter-api/5.4.2/junit-jupiter-api-5.4.2.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/apiguardian/apiguardian-api/1.0.0/apiguardian-api-1.0.0.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/opentest4j/opentest4j/1.1.1/opentest4j-1.1.1.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/junit/platform/junit-platform-commons/1.4.2/junit-platform-commons-1.4.2.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/junit/jupiter/junit-jupiter-params/5.4.2/junit-jupiter-params-5.4.2.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/junit/jupiter/junit-jupiter-engine/5.4.2/junit-jupiter-engine-5.4.2.jar!/" />
          <root url="jar://$MAVEN_REPOSITORY$/org/junit/platform/junit-platform-engine/1.4.2/junit-platform-engine-1.4.2.jar!/" />
        </CLASSES>
        <JAVADOC />
        <SOURCES />
      </library>
    </orderEntry>
  </component>
</module>
