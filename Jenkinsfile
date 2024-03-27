pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from the repository
                git 'https://github.com/PiyushK24/devops.git'
            }
        }
        stage('Build') {
            steps {
                // Build the Maven project
                bat 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                // Run tests
                bat 'mvn test'
            }
        }
    }
    
    post {
        success {
            // Notify success
            echo 'Pipeline succeeded!'
        }
        failure {
            // Notify failure
            echo 'Pipeline failed :('
        }
    }
}
