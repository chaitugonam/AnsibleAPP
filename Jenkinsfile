pipeline {
    agent any
    
    tools
    {
       maven "maven"
    }
     
    stages {
      stage('checkout') {
           steps {
             
                git branch: 'main', url: 'https://github.com/chaitugonam/AnsibleAPP.git'
             
          }
        }
         stage('Tools Init') {
            steps {
                script {
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
               def tfHome = tool name: 'Ansible'
                env.PATH = "${tfHome}:${env.PATH}"
                 sh 'ansible --version'
                    
            }
            }
        }
     
        
         stage('Execute Maven') {
           steps {
             
                sh 'mvn package'             
          }
        }
        
        
         
        
        
        
        stage('Ansible Deploy') {
             
            steps {
                 
             
               
               ansiblePlaybook credentialsId: 'ansikey', disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventories/dev/hosts', playbook: 'main.yml'

               
            
            }
        }
    }
}
