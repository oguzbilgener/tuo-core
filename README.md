#tuo-core

This is the core repository for our project. The code in this repo will be used both in the Android project and the Play project.

## Before cloning
### How your directory structure should be
To create the neccessary directory structure, get into your favorite development directory first. Let's say it is called `dev`, in my `/Users/oguzbilgener` user directory. then it can also be relatively accessed via `~/dev`.

Our **tuo** main directory should be called `tuo`, and it should exist inside the `dev` directory. So its path should be `~/dev/tuo`.


## Cloning
Then we can start cloning the `tuo-core` repo. to do it, **cd** into `~/dev/tuo` we just mentioned, and just `$ git clone https://github.com/oguzbilgener/tuo-core.git`. It will create a new directory inside `tuo` that is called `tuo-core` and you are going to use it.

## Developing tuo-core
All development works to tuo-core, the repo which contains our core classes should be done in `tuo/tuo-core` directory. You should frequently `git pull` here, to receive the latest updates. When you make a change, you can `git add`, `git commit` and `git push`.

## Using tuo-core
We will use tuo-core inside our tuo-android and tuo-server repositories. (To be continued)