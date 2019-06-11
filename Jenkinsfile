pipeline { 
    agent any  
    stages { 
        stage('Build') { 
            steps { 
               sh "mvn clean package"
            }
        }
        stage('Deploy'){
            steps{
                sh 'cp target/Helloworld.war Helloworld.war'
                sshPublisher(publishers:[sshPublisherDesc(configName:'INSERTCONFIGNAME', transfers:[sshTransfer(cleanRemote: false, excludes: '', execCommand: '/usr/local/payara/bin/asadmin --passwordfile password.properties --host localhost --user admin deploy --force Helloword.war', execTimeout: 12000000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '', remoteDirectorySDF: false, removePrefix: '', sourceFiles: 'Helloworld.war')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])
       
            }
        }
    }
}
