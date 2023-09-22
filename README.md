# activity-launch-modes
## Start activity using adb command
    adb shell am start -n com.example.launchmodes/.MainActivity

## launchMode="singleTop"
When ActivityB is on top of MainActivity, an new instance of MainActivity will be created.

## launchMode="singleTask"
When ActivityB is on top of MainActivity, ActivityB will be finished, making MainActivity the top activity. MainActivity.onNewIntent will be called.
