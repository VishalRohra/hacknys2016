/**
 * Created by swapneelc on 4/3/16.
 */
public class clocker {
   < android:layout_centerHorizontal="true"

    android:layout_marginTop="73dp"

    android:textSize="92sp"

            />

    <Button

    android:layout_width="wrap_content"

    android:layout_height="wrap_content"

    android:text="@string/start"

    android:id="@+id/start_button"

    android:layout_below="@+id/time_view"

    android:layout_centerHorizontal="true"

    android:layout_marginTop="110dp"

    android:onClick="onClickStart" />

    <Button

    android:layout_width="wrap_content"

    android:layout_height="wrap_content"

    android:text="@string/stop"

    android:id="@+id/stop_button"

    android:layout_below="@+id/start_button"

    android:layout_centerHorizontal="true"

    android:onClick="onClickStop" />

    <Button

    android:layout_width="wrap_content"

    android:layout_height="wrap_content"

    android:text="@string/reset"

    android:id="@+id/reset_button"

    android:layout_below="@+id/stop_button"

    android:layout_centerHorizontal="true"

    android:onClick="onClickReset" />

    </RelativeLayout>

    strings.xml

            <resources>

    <string name="app_name">MyStopwatch</string>

    <string name="action_settings">Settings</string>

    <string name="start">Start</string>

    <string name="stop">Stop</string>

    <string name="reset">Reset</string>

    </resources>
}
