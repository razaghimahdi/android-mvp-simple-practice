## android-mvp-simple-practice


#### developed by **Mahdi Razzaghi Ghaleh**
MVP simple practice by JAVA android

#### Model View Presenter(MVP) Pattern:
The MVP pattern is a user interface software architecture pattern that reduces the behavior of the UI Components, in this case those interactions with fragments and activities.  
So it reduces the UI components Behavior to a bare minimum by using a presenter.

###### basically MVP has three things: View, Presenter and Model.
##### The Model:
Each layer has its own models and models contain data relevant only to that layer,
Like: View Model, Database Model, Network Model. When data moves between layers the models are transformed from one representation to another.
##### The Presenter:
The Presenter is simply a controller like class to handle the presentation logic and update the view accordingly.
Presenters are middle men between the view and the model, it also contains the logic pertaining to the presentation of the data, retrieves the data from the model, formats the data before passing it to the view, presenter also updates the UI via the view.
##### The View:
In MVP, the activity/ fragment/ view is passive and cannot access the model directly.
The view has a reference to the presenter and propagates events from the UI to the presenter, like: onClick events, lifecycle events.
The View exposes methods which control to presentation of data(or model), like: show or hide certain elements.



##### How does MVP help?
The Model View Presenter pattern increases the separation of concerns and facilitates unit testing
Using a consistent architectural and design pattern, the development process becomes much more consistent, a lot easier and transport.

In order to build a clean code in the MVP architecture, some tools and frameworks are needed: Dagger 2, Retrofit 2 RxJava, ButterKnife, JUint.
Dagger 2 is a dependency injection, What is a dependency?
It's when one component of your app depends on other component of your app.  
Dependency --> Object that can be used.
Injection --> Passing of a dependency to a dependent object(a client) that would use it.
"Dependency Injection is a $25 term for a $0.05 concept." -James Shore
[more...](https://github.com/razaghimahdi/dagger2-java-practice#dependency-injection-)
