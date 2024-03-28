pipeline {
    agent any
    tools {
        // "M2_HOME" added to the path.
        maven 'M2_HOME'
    }

	stages {
        stage('Git Checkout') {
            steps {
                echo "This is git checkour stage"
		        git branch: 'main', url: 'https://github.com/Swapnil123321/FinanceMe-project.git'
            }
		}
        stage('Publish the HTML report using TestNG') {
            steps {
                echo "This step will publish html reports"
                publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: '/var/lib/jenkins/workspace/Banking-capstone-project/target/surefire-reports', reportFiles: 'index.html', reportName: 'HTML Report', reportTitles: '', useWrapperFileDirectly: true])
            }
		}        
    }
}