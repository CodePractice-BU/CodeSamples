# CodeSamples

## What is this repository for?

This repository is used for code review for leecode practices.

## How do I get set up?

IDE: you choices to choose your ide

## Contribution guidelines

I will be setting up a project and do a inital commit. Please do not commit onto mainline, each time, check out your own local branch and commit/push to a remote branch(not mainline)

## Who do I talk to?

Any question pelease reach out to me directly

# Git Help Tutorial

If we want to make some changes using git from the remote repository, we can follow these steps:

- git clone      **Clone a repository into a new directory**

- git checkout -b <Branch Name>   **Switch branches**
  
  **Please make sure you are in the right directory**
    
- git branch    **List branches**

- (Make some changes to README.md in commandline)
   
- git status  **Show the working tree status(If you added some lines in README.md you could see some tips like : Modified RRADME.md etc)**

- (git checkout master)

- git add README.md    **Add  changes**

- git commit -m "Hello World"   **Record changes to the repository (Commit Changes and leave a message you want)**

- git log      **Show commit logs(Show activities of master and branch you are working on )**

- git pull     **Fetch from and integrate with another repository or a local branch (If some changes have been made on the master when you are editing your own branch, you can use this instruction to fetch these changes to your local branch)**

- git rebase mster  **Reapply commits on top of another base tip**

- git push -u origin <branch>    **Update remote refs along with associated objects**






