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

<products>
    	<bar SN="VyfdmYr">
		<fett>27.19</fett>
		<energy>1288.07</energy>
		<kolhydrat>25.96</kolhydrat>
		<protein>39.49</protein>
		<fiber>44.04</fiber>
		<review>
			<reviewer personID="PJ8">
				<date>2014-02-11</date>
				<score>4</score>
			</reviewer>   
		</review>
	</bar>


	<bar SN="pQEk83O">
		<fett>6.14</fett>
		<energy>2426.02</energy>
		<kolhydrat>1.4</kolhydrat>
		<protein>23.45</protein>
		<fiber>17.21</fiber>
		<review>
			<reviewer personID="k6Y">
				<date>2000-10-09</date>
				<score>5</score>
			</reviewer>
			<reviewer personID="k6p">
				<date>2000-10-09</date>
				<score>5</score>
			</reviewer>
		</review>
	</bar>   
</products>
