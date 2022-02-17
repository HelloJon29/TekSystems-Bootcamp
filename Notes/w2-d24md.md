## GIT

# Version Control

**What it is**

 - Version control systems are a category of software tools that help a software team manage changes to source code over time.
 - Software development teams are continually writing new source code and changing existing source code.Version control helps teams track every individual change, by contributor.

**USE CASE**

 - collaboration
 - storing

**Version Control Systems/Tools**

 - Git
 - microsoft team foundation server
 - helix core
 - subversion
 - aws codeCommit
 - rational clearCase
 - mercurial
 - micro focus accurev
 - cvs

**What is Git**

 - free open source distributed version control system
 - designed to handle small to large products with speed and efficiency
 - The most commonly used vcs today, becoming the standard

**Git basics**

 - Git add <file_name> or <.> for adding all
 - Git commit -m <"some text">, not using -m will open default text editor
 - Git push
 - git pull
 - code . will open default text editor
 - git clone
 - git remote add
 - git fetch

**GITs role in DevOps**
> CODE>SHARED REPOSITORY

**Fundamental Elements**

 - Working directory : Stores files on which changes have been made
 - staging area: stores files on which add command is executed
 - local repository: Local machine where commit command is used
 - remote repository : where files are stored after push command

**Create Local Repositories**

- git init

**SHA-1 Hash**
 - Every commit is represented by SHA -1 Hash value
 - git log will show full SHA -1 Hash for each commit
 - git log --oneline will show only 7 digits
 - you can use either to reference the commit
 - git reset <hash value> will return you to a previous commit you specify, local repository commits after the called value will be gone

**BRANCHES**

 - Branches are isolated environments for changes to codebases. When a dev wants to implement a new feature is when you'd want to use a Branch
 - branch functions
>  - git branch <name of branch: creates a branch
>  - git branch : shows a list of all branches (git branch -a shows all branches local and remote)
>  - git checkout(or switch) <name of branch: switches to specified branch

**HEAD**
 - Head indicates the current working branch, in other words it just references that branch
 - it points to the latest commit in the branch selected

**Tags**
 - Create tag:
>  - git tag -a <tag name> <Shaw-hash> -m <"Some message"> : creates tag for specific commit, if you wanna version all the same remove shaw-hash
>  - git tag : lists all tags

**Changes UNDO**

 - git revert <commitid>: safer option to return to previous point
 - git reset <type> <commitid>:
>  - git reset --hard resets the index(staging area) and working tree. any changes since the commit is discarded
>  - git reset --soft does not touch the index. leaves all changed files as Changes to be commited
>  - git reset --mixed removes staging area and leave untracked changes
 - git restore --staged <file>

**Revision**
 - Represents every change made. Basically a commit

**Distributed Development**
 - Working copy, repository, server repository for every developer.

**Pull request**
 - This is a way to ask another dev to merge one of your branches into their repository
 - create a fork on github, clone the repository, make changes, create pull request on github

**git diff**
 - 