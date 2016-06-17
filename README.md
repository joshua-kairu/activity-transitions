# intapoleta

Moving things in Android.

## Introduction :point_up:

An interpolator in Android defines the rate of change of an Android animation. Here holds an app that shows various [Android interpolations](https://developer.android.com/reference/android/view/animation/Interpolator.html). Base code was gotten from [Udacity](https://www.udacity.com/). Their [Material Design for Android Developers](https://www.udacity.com/course/material-design-for-android-developers--ud862) online class had a sample from which this app was made. Original code is seated in [this](https://github.com/udacity/ud862-samples) repo, in the 

This repo contains the implementation of a [Udacity](https://www.udacity.com/) sample app that shows the various ways one can scale an image to fit inside an Android [ImageView](https://developer.android.com/reference/android/widget/ImageView.html). The tutorial was made to teach good image habits in Udacity's [Material Design for Android Developers](https://www.udacity.com/course/material-design-for-android-developers--ud862) class. The class can be found online. Original code is stored in  repository in the [InterpolationDemo folder](https://github.com/udacity/ud862-samples/tree/master/InterpolationDemo).

## Version History :package:

**latest** 	[XML Test v1.0.0](https://github.com/joshua-kairu/xml-test/releases/download/v1.0/XML-Test-v1.0.0.apk) 	Thursday, June 16, 2016

This repo tries its best to follow the [Semantic Versioning](http://semver.org/) guidelines.

## How To Use :wrench:

:zero: Install and run the app.

:one: You will find two pull-down menus - one for the interpolation, and the second for the time the animation will take - and the text ```Hello Other World```. The text will animate from the bottom of the screen to the middle of the screen using the selected interpolator and the selected animation duration.

:two: Enjoy checking out the various rates of changes and decide for yourself which duration is the best for a standard animation. :grin:

There is a video here showing each interpolator animating within 0.9 seconds.

![](screen-records/intapoleta-900ms-2016-06-16-115503.gif) 

## Abilities :muscle:

This app can:
* Show the effects of the default Android interpolators.
* Show how animation duration affects the quality of an animation.

## Limitations :worried:

This app is simply a tutorial one. Here are some things it cannot do:
* Allow the user to change the words of the text. Yes you will keep `Hello`ing the `Other World`.:innocent:

## Possible Future Work :fast_forward:

As of Thursday, June 16, 2016, some work that can be done in the future could be: 
- [ ] Allow users to change the `Hello Other World` text. 

## Other things :books:

Credits to:
* Udacity for this app's basics.
* Jake Wharton for [Butter Knife](http://jakewharton.github.io/butterknife/), a library for binding fields to views in Android. Really helped with the [spinners].

## License :lock_with_ink_pen:

This repository is licensed under the [GNU General Public License Version 3](http://www.gnu.org/licenses/gpl-3.0.en.html).
