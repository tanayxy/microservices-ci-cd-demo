pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat '.\\gradlew.bat build'
            }
        }
        stage('Test') {
            steps {
                bat '.\\gradlew.bat test'
            }
        }
    }
}
    
    
        post {
            always {
                archiveArtifacts artifacts: '**/build/libs/*.jar', fingerprint: true
                junit '**/build/test-results/**/*.xml'
            }
        }
    }