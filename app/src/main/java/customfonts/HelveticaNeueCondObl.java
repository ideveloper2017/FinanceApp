package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatEditText;

public class HelveticaNeueCondObl extends AppCompatEditText {

    public HelveticaNeueCondObl(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public HelveticaNeueCondObl(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public HelveticaNeueCondObl(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/HelveticaNeue-CondObl.ttf");
            setTypeface(tf);
        }
    }

}
