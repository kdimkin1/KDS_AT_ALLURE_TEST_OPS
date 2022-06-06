# Automation Tests (example configuration with using AllureTestOps )

## Technology Stack
|<a href="https://www.jetbrains.com/idea/"><img src="images/IDEA-logo.svg" width="40" height="40"  alt="IDEA"/></a>  | <a href="https://qameta.io/"><img src="images/testopslogo.svg" width="100" height="40"  alt="IDEA"/></a> | <img src="images/java-logo.svg" width="40" height="40"  alt="Java"/> | <img src="images/git-logo.svg" width="40" height="40"  alt="git-logo"/> | <img src="images/junit5-logo.svg" width="40" height="40"  alt="JUnite"/> | <img src="images/rest-assured-logo.png" width="40" height="40"  alt="Rest-Assured"/> | <img src="images/Allure_Report.svg" width="40" height="40"  alt="Allure"/> | <img src="images/Jenkins.svg" width="40" height="40"  alt="Jenkins"/> |
|:------------------------------------------------------------------------------------------------------------------:|:--------------------------------------------------------------------------------------------------------:| :---------: |:---------------------------------------------------------------------------------------------------------------------:|:------------------------------------------------------------------------:|:------------------------------------------------------------------------------------:|:--------------------------------------------------------------------------:|:---------------------------------------------------------------------------:|
|                                                        IDEA                                                        |                                              AllureTestops                                               | Java |                                                          Git                                                          |                                  JUnite                                  |                                     Rest-Assured                                     |                                   Allure                                   |                                   Jenkins                                   |



##  Allure Test Ops:
##### https://allure.autotests.cloud/project/1358
>```С11-KDS-AT_allure-examples```
###  Dashboards:
![image](images/AOT_dashboards1.png)  ![image](images/AOT_dashboards2.png)
###  Launches:
![image](images/ATO_launches.png)
###  Jobs:
![image](images/ATO_jobs.png)


##  Jenkins:
##### https://jenkins.autotests.cloud/job/C11-KDS-ATO-HW23/
##### https://jenkins.autotests.cloud/job/C11-KDS-ATO-HW23_PIPLINE/
>pipeline example:
> ```
>  pipeline {
>    agent any
>    parameters {
>        string(name: 'BRANCH_NAME', defaultValue: 'master')
>        string(name: 'BASE_URL', defaultValue: 'https://testing.github.com')
>    }
>    stages {
>        stage('Checkout') {
>            steps {
>                git 'https://github.com/kdimkin1/KDS_AT_ALLURE_TEST_OPS.git'
>            }
>        }
>        stage('Test') {
>            steps {
>                withAllureUpload(name: '${JOB_NAME} - #${BUILD_NUMBER}', projectId: '1358', results: [[path: 'build/allure-results']], serverId: 'allure-server', tags: 'nightly') {
>                sh './gradlew clean test'
>                }                
>            }
>        }
>    }
> }


## Notes:
### For  Allure Test Ops:

* Dashboards -> Add widgets: Pay you attentions on Metrics:
> Summary Test Cases Duration -- evaluation of automation efficiency   
> 
> Retries count, Test Results count exclude retries, Summary retries duration -- assessment of the stability of the environment


### IDEA integration:
* Plugin:  Allure TestOps Support
1. Install plugin
2. Tools-> Allure -> Authorize
* For upload tests results:
>../builds/allure-results -> Allure: Uploads Results
> 
>       Project
>       Launch Name

### Jenkins:
* Plugin: Allure TestOps for Jenkins
>Dashboard->Configure Jenkins -> Plugin Manager -> Additional
-> Chose File
-> URL address:  (see: https://qameta.github.io/distributions/ use Latest Version )
Deploy

### Jira:
* Plugin: Allure TestOps for Jira 
>->Manage -> Configure:  Issue Tracker Key (see Allure Test Ops -> Issue Tracker)

* For migrate data from TMS Zephyr plugin to Allure Test Ops ask qameta.io support for migration scripts.

## Common links:
##### https://docs.qameta.io
##### https://qameta.github.io/distributions




