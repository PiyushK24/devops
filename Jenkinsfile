pipeline {
    agent any
    tools{maven 'MAVEN_HOME'
         jdk 'JAVA_HOME'}
    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from the repository
                script {
                    git 'https://github.com/PiyushK24/devops.git'
                }
            }
        }
        stage('Build') {
            steps {
                // Build the Maven project
                script {
                    sh 'mvn clean package'
                }
            }
        }
        stage('Test') {
            steps {
                // Run tests
                script {
                    sh 'mvn test'
                }
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
