# Git Repo Creation

### Create a new repository on the command line

```
echo "# myapp1" >> README.md
git init
git add README.md
git commit -m "Initial commit"
git remote add origin https://github.com/pwu1688/myapp1.git
git push -u origin master

### Push an existing repository from the command line

git remote add origin https://github.com/pwu1688/myapp1.git
git push -u origin master
```

## Actual Commands

### Pre-requisite: One-time Setup

```
$ git config --global http.proxy http://naproxy.company.com:80
$ git config --global user.email "MyEmail@company.com"
$ git config --global user.name "MyGitUserName"
```

### Step 1: Initialize git repository in github

Such as https://github.com/pwu1688/myapp1.git

### Step 2: Create a Springboot App, Name: myapp1

Use Spring Tool 4

### Step 3: Execute the following commands in local project folder to push code into github repo

Use VS Code Terminal/company only can use dos cmd:

```
$ cd myapp1

$ ll
total 58
drwxr-xr-x 1 pwu1688 197609 0 Mar 31 16:21 ./
drwxr-xr-x 1 pwu1688 197609 0 Mar 31 16:14 ../
-rw-r--r-- 1 pwu1688 197609 2017 Mar 31 16:21 .classpath
-rw-r--r-- 1 pwu1688 197609 7307 Mar 31 16:21 .factorypath
-rw-r--r-- 1 pwu1688 197609 303 Mar 31 16:01 .gitignore
drwxr-xr-x 1 pwu1688 197609 0 Mar 31 16:01 .mvn/
-rw-r--r-- 1 pwu1688 197609 1129 Mar 31 16:02 .project
drwxr-xr-x 1 pwu1688 197609 0 Mar 31 16:15 .settings/
-rw-r--r-- 1 pwu1688 197609 355 Mar 31 16:01 HELP.md
-rwxr-xr-x 1 pwu1688 197609 9114 Mar 31 16:01 mvnw\*
-rw-r--r-- 1 pwu1688 197609 5811 Mar 31 16:01 mvnw.cmd
-rw-r--r-- 1 pwu1688 197609 1478 Mar 31 16:16 pom.xml
drwxr-xr-x 1 pwu1688 197609 0 Mar 31 16:01 src/
drwxr-xr-x 1 pwu1688 197609 0 Mar 31 16:21 target/

$ git init
Initialized empty Git repository in C:/Users/pwu1688/Documents/sts-workspace/myapp1/.git/

$ git remote add origin https://github.com/pwu1688/myapp1.git

$ git remote -v
origin https://github.com/pwu1688in/myapp1.git (fetch)
origin https://github.com/pwu1688in/myapp1.git (push)

$ git pull origin master
remote: Enumerating objects: 4, done.
remote: Counting objects: 100% (4/4), done.
remote: Compressing objects: 100% (3/3), done.
remote: Total 4 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (4/4), done.
From https://github.com/pwu1688in/myapp1

- branch master -> FETCH_HEAD
- [new branch] master -> origin/master

$ ll
total 75
drwxr-xr-x 1 pwu1688 197609 0 Mar 31 16:33 ./
drwxr-xr-x 1 pwu1688 197609 0 Mar 31 16:14 ../
-rw-r--r-- 1 pwu1688 197609 2017 Mar 31 16:21 .classpath
-rw-r--r-- 1 pwu1688 197609 7307 Mar 31 16:21 .factorypath
drwxr-xr-x 1 pwu1688 197609 0 Mar 31 16:33 .git/
-rw-r--r-- 1 pwu1688 197609 303 Mar 31 16:01 .gitignore
drwxr-xr-x 1 pwu1688 197609 0 Mar 31 16:01 .mvn/
-rw-r--r-- 1 pwu1688 197609 1129 Mar 31 16:02 .project
drwxr-xr-x 1 pwu1688 197609 0 Mar 31 16:15 .settings/
-rw-r--r-- 1 pwu1688 197609 355 Mar 31 16:01 HELP.md
-rw-r--r-- 1 pwu1688 197609 11558 Mar 31 16:33 LICENSE
-rwxr-xr-x 1 pwu1688 197609 9114 Mar 31 16:01 mvnw\*
-rw-r--r-- 1 pwu1688 197609 5811 Mar 31 16:01 mvnw.cmd
-rw-r--r-- 1 pwu1688 197609 1478 Mar 31 16:16 pom.xml
-rw-r--r-- 1 pwu1688 197609 12 Mar 31 16:33 README.md
drwxr-xr-x 1 pwu1688 197609 0 Mar 31 16:01 src/
drwxr-xr-x 1 pwu1688 197609 0 Mar 31 16:21 target/

$ git add --all
warning: LF will be replaced by CRLF in .gitignore.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in .mvn/wrapper/MavenWrapperDownloader.java.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in .mvn/wrapper/maven-wrapper.properties.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in mvnw.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in mvnw.cmd.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in pom.xml.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in \src\main\java/com/example/demo/Myapp1Application.java.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in src\main\resources\application.properties.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in src\test\java\com\example\demo\Myapp1ApplicationTests.java.
The file will have its original line endings in your working directory.

$ git commit -m "Initial commit"
[master 7fd4b61] Initial
11 files changed, 695 insertions(+)
create mode 100644 .gitignore
create mode 100644 .mvn/wrapper/MavenWrapperDownloader.java
create mode 100644 .mvn/wrapper/maven-wrapper.jar
create mode 100644 .mvn/wrapper/maven-wrapper.properties
create mode 100644 mvnw
create mode 100644 mvnw.cmd
create mode 100644 pom.xml
create mode 100644 \src\main\java\com\example\demo\Myapp1Application.java
create mode 100644 src\main\resources\application.properties
create mode 100644 src\test\java\com\example\demo\Myapp1ApplicationTests.java

$ git push origin master
Enumerating objects: 28, done.
Counting objects: 100% (28/28), done.
Delta compression using up to 8 threads.
Compressing objects: 100% (18/18), done.
Writing objects: 100% (27/27), 50.04 KiB | 2.50 MiB/s, done.
Total 27 (delta 0), reused 0 (delta 0)
To https://github.com/pwu1688in/myapp1.git
10b068b..7fd4b61 master -> master

```
