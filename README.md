#tuo-core

This is the core repository for our project. The code in this repo will be used both in the Android project and the Play project.

## Before developing
### How your directory structure should be
To create the neccessary directory structure, get into your favorite development directory first. Let's say it is called `dev`, in my `/Users/oguzbilgener` user directory. then it can also be relatively accessed via `~/dev`.

Our **tuo** main directory should be called `tuo`, and it should exist inside the `dev` directory. So its path should be `~/dev/tuo`.


## Opening a new project
We cannot just clone the project, because of some reasons. 

<!--Then we can start cloning the `tuo-core` repo. to do it, **cd** into `~/dev/tuo` we just mentioned, and just `$ git clone https://github.com/oguzbilgener/tuo-core.git`. It will create a new directory inside `tuo` that is called `tuo-core` and you are going to use it.-->

## Developing tuo-core
All development works to tuo-core, the repo which contains our core classes should be done in `tuo/tuo-core` directory. You should frequently `git pull` here, to receive the latest updates. When you make a change, you can `git add`, `git commit` and `git push`.

## Using tuo-core
We will use tuo-core inside our tuo-android and tuo-server repositories. So, in order for our subprojects to use them, they should be able to access them. They could use the `tuo-core` repo we just cloned, however, it might also cause problems. For instance, whenever you push your Play project to the server, the core repository should also be updated on the server. Perhaps this could also be provided, but let's try that later.
### In server
In the Play project, the `app` directory contains all the Java core we are going to write. Then, our core code should also exist in the same directory. To be continued.