## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Maven Setup](#maven-setup)
* [Project Setup](#maven-setup)

## General info
This project is an automation of product selection and top buttons validation of website www.revzilla.com.
	
## Technologies
Project is created with:
* Java: 15.0.1
* Eclipse IDE: 4.17.0

## Maven Setup
To run this project, setup Maven:
* **Step 1**: Set JAVA Environment:
	* Set the JAVA_HOME environment variable to point to the base directory location where Java is installed on your machine (ex.):
		* **Windows**: Set the environment variable JAVA_HOME to C:\Program Files\Java\jdk1.7.0_60
		* **Linux**: export JAVA_HOME=/usr/local/java-current
		* **Mac**: export JAVA_HOME=/Library/Java/Home
	* Append Java compiler location to System Path:
		* **Windows**: Append the string “;C:\Program Files\Java\jdk1.7.0.60\bin” to the end of the system variable, Path.
		* **Linux**: export PATH=$PATH:$JAVA_HOME/bin/
		* **Mac**: not required
	* Verify Java Installation using java -version


* **Step 2**: Download Maven Archive:
	* Download Maven 3.3+ from https://maven.apache.org/download.cgi


* **Step 3**: Extract the Maven Archive:
	* Extract the archive, to the directory you wish to install Maven 3.3+. The subdirectory apache-maven-3.3+ will be created from the archive.
		* **Windows**: C:\Program Files\Apache Software Foundation\apache-maven-3.3+.
		* **Linux**: /usr/local/apache-maven
		* **Mac**: /usr/local/apache-maven

* **Step 4**: Set Maven Environment Variables:
	* **Windows**: Set the environment variables using system properties.
		*  M2_HOME=C:\Program Files\Apache Software Foundation\apache-maven-3.3.1 M2=%M2_HOME%\bin MAVEN_OPTS=-Xms256m -Xmx512m
	*  **Linux**: Open command terminal and set environment variables.
		*  export M2_HOME=/usr/local/apache-maven/apache-maven-3.3.1 export M2=$M2_HOME/bin
		*  export MAVEN_OPTS=-Xms256m -Xmx512m
	*  **Mac**: Open command terminal and set environment variables.
		*  export M2_HOME=/usr/local/apache-maven/apache-maven-3.3.1 export M2=$M2_HOME/bin
		*  export MAVEN_OPTS=-Xms256m -Xmx512m
* **Step 5**: Add Maven bin Directory Location to System Path:
	* **Windows**: Append the string ;%M2% to the end of the system variable, Path.
	*  **Linux**: export PATH=$M2:$PATH
	*  **Mac**: export PATH=$M2:$PATH

* **Step 6**: Verify Maven Installation (Open Command Console, Command Terminal or Terminal):
	* **Windows**: c:\> mvn --version.
	*  **Linux**: $ mvn --version
	*  **Mac**: machine:~ joseph$ mvn --version


## Project Setup
To run this project, download it and run it locally using cmd:

```
$ cd ../RevZilla
$ mvn clean
$ mvn compile
$ mvn test
```

