pipeline { 
    agent any  
    stages { 
        stage('Build') { 
            steps { 
               sh "mvn clean package"
            }
        }
        stage('Sonarqube') {
            environment {
                scannerHome = tool 'SonarQubeScanner'
            }
/*
    steps {
        withSonarQubeEnv('sonarqube') {
            sh "${scannerHome}/bin/sonar-scanner"
        }

        timeout(time: 10, unit: 'MINUTES') {
            waitForQualityGate abortPipeline: true
        }
    }
    */
	}
        stage('Deploy'){
            steps{
                sh 'cp target/Helloworld.war Helloworld.war'
                sshPublisher(publishers:[sshPublisherDesc(configName:'testrig', transfers:[sshTransfer(cleanRemote: false, excludes: '', execCommand: '/home/student/payara/payara5/bin/asadmin --passwordfile password.properties --host localhost --user admin deploy --force Helloworld.war', execTimeout: 12000000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '', remoteDirectorySDF: false, removePrefix: '', sourceFiles: 'Helloworld.war')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])
       
            }
        }
    }
}
