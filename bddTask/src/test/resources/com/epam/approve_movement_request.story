Narrative:
    As a OSM-User with Resource Manager (RM) or Room Owner (RO) rights
    I want to be able to approve employees movement's requests
    So that Employees can change theirs workplaces

Scenario: Approve Employees movement request by clicking on Approve button
Given OSM-User is logged as a 'role'
And OSM-User navigates to My Requests page
And OSM-User has assigned requests
When OSM-User click on Approve button
Then Employees movement request is completed
Examples:
|role|
|RM |
|RO |

Scenario: Approve Employees movement request by clicking on Approve button
Given OSM-User is logged as a 'role'
And OSM-User navigates to My Requests page
And OSM-User has assigned requests
When OSM-User click on Approve button
Then Employees movement request is completed
Examples:
|role|
|RM |
|RO |
