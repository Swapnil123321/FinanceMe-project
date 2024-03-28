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
		stage('Create a package') {
	        steps {
	            echo "This step will create a package using maven"
	            sh "mvn package"
	        }
		} 
	           
    }
}