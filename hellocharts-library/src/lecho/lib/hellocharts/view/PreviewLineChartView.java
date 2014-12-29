package lecho.lib.hellocharts.view;

import lecho.lib.hellocharts.PreviewChartCalculator;
import lecho.lib.hellocharts.gesture.PreviewChartTouchHandler;
import lecho.lib.hellocharts.renderer.PreviewLineChartRenderer;
import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;

public class PreviewLineChartView extends LineChartView {
	private static final String TAG = "PreviewLineChartView";

	protected PreviewLineChartRenderer previewChartRenderer;

	public PreviewLineChartView(Context context) {
		this(context, null, 0);
	}

	public PreviewLineChartView(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

    public PreviewLineChartView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		chartCalculator = new PreviewChartCalculator();
		previewChartRenderer = new PreviewLineChartRenderer(context, this, this);
		chartRenderer = previewChartRenderer;
		touchHandler = new PreviewChartTouchHandler(context, this);
	}

	public void setPreviewColor(int color) {
		previewChartRenderer.setPreviewColor(color);
		ViewCompat.postInvalidateOnAnimation(this);
	}

	public int getPreviewColor() {
		return previewChartRenderer.getPreviewColor();
	}

}
