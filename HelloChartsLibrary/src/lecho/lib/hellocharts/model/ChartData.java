package lecho.lib.hellocharts.model;

import android.graphics.Typeface;

/**
 * Base interface for all chart data models.
 * 
 * @author Leszek Wach
 * 
 */
public interface ChartData {

	/**
	 * Updates data by scale during animation
	 */
	public void update(float scale);

	/**
	 * Inform data that animation finished(data should be update with scale 1.0f)
	 */
	public void finish();

	public void setAxisXBottom(Axis axisX);

	public Axis getAxisXBottom();

	public void setAxisYLeft(Axis axisY);

	public Axis getAxisYLeft();

	public void setAxisXTop(Axis axisX);

	public Axis getAxisXTop();

	public void setAxisYRight(Axis axisY);

	public Axis getAxisYRight();

	/**
	 * Returns color used to draw value label text.
	 */
	public int getValueLabelTextColor();

	/**
	 * Set value label text color, by default Color.WHITE.
	 */
	public void setValueLabelsTextColor(int labelsTextColor);

	/**
	 * Returns text size for value label in SP units.
	 */
	public int getValueLabelTextSize();

	/**
	 * Set text size for value label in SP units.
	 */
	public void setValueLabelTextSize(int labelsTextSize);

	public Typeface getValueLabelTypeface();

	public void setValueLabelTypeface(Typeface typeface);

	public boolean isValueLabelBackgroundEnabled();

	/**
	 * Set whether labels should have rectangle background. Default is true.
	 */
	public void setValueLabelBackgroundEnabled(boolean isValueLabelBackgroundEnabled);

	public boolean isValueLabelBackgroundAuto();

	/**
	 * Set false if you want set custom color for all value labels. Default is true.
	 */
	public void setValueLabelBackgroundAuto(boolean isValueLabelBackgrountAuto);

	public int getValueLabelBackgroundColor();

	/**
	 * Set value labels background. This value is used only if isValueLabelBackgroundAuto returns false. Default is
	 * green.
	 */
	public void setValueLabelBackgroundColor(int valueLabelBackgroundColor);
}