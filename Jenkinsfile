pipeline {
    agent any
     
    stages {
      stage('checkout') {
           steps {
             
                git branch: 'main', url: 'https://github.com/chaitugonam/AnsibleAPP.git'
             
          }
        }
       
     
        
         stage('Execute Maven') {
           steps {
             
                sh 'mvn package'             
          }
        }
        
        
         
        
        
        
        stage('Ansible Deploy') {
             
            steps {
                 
              sh 'mvn package'
               
              

               
            
            }
        }
    }
}
