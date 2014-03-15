#tuo-core

This is the core repository for our project. The code in this repo will be used both in the Android project and the Play project.

## Before starting
Use Linux or OS X! (Especially if you are developing the server app)
### How your directory structure should be
To create the neccessary directory structure, get into your favorite development directory first. Let's say it is called `dev`, in my `/Users/oguzbilgener` user directory. then it can also be relatively accessed via `~/dev`.

Our **tuo** main directory should be called `tuo`, and it should exist inside the `dev` directory. So its path should be `~/dev/tuo`.

To illustrate it:
```
- tuo
-- : tuo-core
	 --- : libs
	 --- : src
-- : tuo-android
	 --- : app
	 --- : dependencies
	 --- : gradle
-- : tuo-server
	 --- : app
```


## Cloning
Since tuo-core is the most important dependency for our other projects, a `tuo-core` repository must exist in `~/dev/tuo` directory. To clone it, **cd** into `~/dev/tuo` we just mentioned, and just `$ git clone https://github.com/oguzbilgener/tuo-core.git`. It will create a new directory inside `tuo` that is called `tuo-core` and you are going to use it.

## Developing tuo-core
All development works to tuo-core, the repo which contains our core classes, should be done in `tuo/tuo-core` directory. You should frequently `git pull` here, to receive the latest updates. When you make a change, you can `git add`, `git commit` and `git push`. Using **Intellij IDEA** is recommended, but you can use any IDE you like, since this is a simple Java project.

## Using tuo-core
### In server
Coming soon. For more instructions, refer to the README.md file of the `tuo-server` project.

### In Android
The Gradle build system in the Android project is made to automatically import `tuo-core`. All you need is the `tuo-core` repo in the same directory with `tuo-android`. Only use **Android Studio**. For more instructions, refer to the README.md file of the `tuo-android` project.
