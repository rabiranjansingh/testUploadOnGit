# testUploadOnGit
HOW TO UPLOAD A PROJECT ON GITHUB 
Microsoft Windows [Version 10.0.18362.476]
(c) 2019 Microsoft Corporation. All rights reserved.

E:\cpptutorial\cpp\io_package>git init
Initialized empty Git repository in E:/cpptutorial/cpp/io_package/.git/

E:\cpptutorial\cpp\io_package>git
usage: git [--version] [--help] [-C <path>] [-c <name>=<value>]
           [--exec-path[=<path>]] [--html-path] [--man-path] [--info-path]
           [-p | --paginate | -P | --no-pager] [--no-replace-objects] [--bare]
           [--git-dir=<path>] [--work-tree=<path>] [--namespace=<name>]
           <command> [<args>]

These are common Git commands used in various situations:

start a working area (see also: git help tutorial)
   clone     Clone a repository into a new directory
   init      Create an empty Git repository or reinitialize an existing one

work on the current change (see also: git help everyday)
   add       Add file contents to the index
   mv        Move or rename a file, a directory, or a symlink
   restore   Restore working tree files
   rm        Remove files from the working tree and from the index

examine the history and state (see also: git help revisions)
   bisect    Use binary search to find the commit that introduced a bug
   diff      Show changes between commits, commit and working tree, etc
   grep      Print lines matching a pattern
   log       Show commit logs
   show      Show various types of objects
   status    Show the working tree status

grow, mark and tweak your common history
   branch    List, create, or delete branches
   commit    Record changes to the repository
   merge     Join two or more development histories together
   rebase    Reapply commits on top of another base tip
   reset     Reset current HEAD to the specified state
   switch    Switch branches
   tag       Create, list, delete or verify a tag object signed with GPG

collaborate (see also: git help workflows)
   fetch     Download objects and refs from another repository
   pull      Fetch from and integrate with another repository or a local branch
   push      Update remote refs along with associated objects

'git help -a' and 'git help -g' list available subcommands and some
concept guides. See 'git help <command>' or 'git help <concept>'
to read about a specific subcommand or concept.
See 'git help git' for an overview of the system.

E:\cpptutorial\cpp\io_package>git init
Reinitialized existing Git repository in E:/cpptutorial/cpp/io_package/.git/

E:\cpptutorial\cpp\io_package>git add
Nothing specified, nothing added.
Maybe you wanted to say 'git add .'?

E:\cpptutorial\cpp\io_package>git add .

E:\cpptutorial\cpp\io_package>git commit -m "adding Files"

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'addin@DESKTOP-RUCIK62.(none)')

E:\cpptutorial\cpp\io_package>git config user.name "rabiranjan kumar"

E:\cpptutorial\cpp\io_package>git config user.email "rabiranjan02@gmail.com"

E:\cpptutorial\cpp\io_package>git commit -m "adding Files"
[master (root-commit) 78c56e5] adding Files
 14 files changed, 394 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 .settings/org.eclipse.jdt.core.prefs
 create mode 100644 bin/com/rabi/io_package/Foo.class
 create mode 100644 bin/com/rabi/io_package/Readingh_from_url.class
 create mode 100644 bin/com/rabi/io_package/emp.xml
 create mode 100644 bin/com/rabi/io_package/input_stream_example.class
 create mode 100644 bin/com/rabi/io_package/rough code
 create mode 100644 bin/com/rabi/io_package/xml_parser.class
 create mode 100644 src/com/rabi/io_package/Readingh_from_url.java
 create mode 100644 src/com/rabi/io_package/emp.xml
 create mode 100644 src/com/rabi/io_package/input_stream_example.java
 create mode 100644 src/com/rabi/io_package/rough code
 create mode 100644 src/com/rabi/io_package/xml_parser.java

E:\cpptutorial\cpp\io_package>git remote add origin https://github.com/rabiranjansingh/testUploadOnGit.git

E:\cpptutorial\cpp\io_package>git push -u origin master
To https://github.com/rabiranjansingh/testUploadOnGit.git
 ! [rejected]        master -> master (fetch first)
error: failed to push some refs to 'https://github.com/rabiranjansingh/testUploadOnGit.git'
hint: Updates were rejected because the remote contains work that you do
hint: not have locally. This is usually caused by another repository pushing
hint: to the same ref. You may want to first integrate the remote changes
hint: (e.g., 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

E:\cpptutorial\cpp\io_package>git pull origin master
warning: no common commits
remote: Enumerating objects: 6, done.
remote: Counting objects: 100% (6/6), done.
remote: Compressing objects: 100% (4/4), done.
remote: Total 6 (delta 1), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (6/6), done.
From https://github.com/rabiranjansingh/testUploadOnGit
 * branch            master     -> FETCH_HEAD
 * [new branch]      master     -> origin/master
fatal: refusing to merge unrelated histories

E:\cpptutorial\cpp\io_package>git push -u origin master
To https://github.com/rabiranjansingh/testUploadOnGit.git
 ! [rejected]        master -> master (non-fast-forward)
error: failed to push some refs to 'https://github.com/rabiranjansingh/testUploadOnGit.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. Integrate the remote changes (e.g.
hint: 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

E:\cpptutorial\cpp\io_package>git push origin master
To https://github.com/rabiranjansingh/testUploadOnGit.git
 ! [rejected]        master -> master (non-fast-forward)
error: failed to push some refs to 'https://github.com/rabiranjansingh/testUploadOnGit.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. Integrate the remote changes (e.g.
hint: 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

E:\cpptutorial\cpp\io_package>git push --force origin master
Enumerating objects: 23, done.
Counting objects: 100% (23/23), done.
Delta compression using up to 8 threads
Compressing objects: 100% (17/17), done.
Writing objects: 100% (23/23), 9.03 KiB | 770.00 KiB/s, done.
Total 23 (delta 0), reused 0 (delta 0)
To https://github.com/rabiranjansingh/testUploadOnGit.git
 + 3bc26e7...78c56e5 master -> master (forced update)

E:\cpptutorial\cpp\io_package>
