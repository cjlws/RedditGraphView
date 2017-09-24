package com.supsim.redditgraphview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PieChart chart = (PieChart)findViewById(R.id.main_pie_chart);

        List<PieEntry> entries = new ArrayList<PieEntry>();

        entries.add(new PieEntry(18.5f, "Green"));
        entries.add(new PieEntry(26.7f, "Yellow"));
        entries.add(new PieEntry(24.0f, "Red"));
        entries.add(new PieEntry(30.8f, "Blue"));
        entries.add(new PieEntry(56.0f, "Test"));

        PieDataSet set = new PieDataSet(entries, "Election Results");
        set.setColors(ColorTemplate.VORDIPLOM_COLORS);

        PieData data = new PieData(set);
        chart.setUsePercentValues(true);
        chart.setData(data);
        chart.invalidate();



// setDrawSliceText(boolean enabled):
// Set this to true to draw the x-value text into the pie slices.
//
// setUsePercentValues(boolean enabled):
// If this is enabled, values inside the chart are drawn in percent and not with their
// original value. Values provided for the ValueFormatter to format are then provided
// in percent.
//
// setCenterText(SpannableString text):
// Sets the text that is drawn in the center of the PieChart. Longer text will be
// automatically "wrapped" to avoid clipping into the pie-slices.
//
// setCenterTextRadiusPercent(float percent):
// Sets the rectangular radius of the bounding box for the center text,
// as a percentage of the pie hole default 1.f (100%).
//
// setHoleRadius(float percent):
// Sets the radius of the hole in the center of the piechart in percent of the maximum radius
// (max = the radius of the whole chart), default 50%
//
// setTransparentCircleRadius(float percent):
// Sets the radius of the transparent circle that is drawn next to the hole in the piechart
// in percent of the maximum radius (max = the radius of the whole chart),
// default 55% -> means 5% larger than the center-hole by default
//
// setTransparentCircleColor(int color):
// Sets the color of the transparent circle.
//
// setTransparentCircleAlpha(int alpha):
// Sets the amount of transparency (0-255) the transparent circle should have.
//
// setMaxAngle(float maxangle):
// Sets the max angle that is used for calculating the pie-circle.
// 360f means it's a full PieChart, 180f results in a half-pie-chart. Default: 360f

// setBackgroundColor(int color): Sets the background color that will cover
// the whole chart-view. In addition, a background-color can be set via .xml
// in the layout file.

// setDescription(String desc):
// Set a description text that appears in the bottom right corner of the chart.

// setDescriptionColor(int color):
// Sets the color of the description text.

// setDescriptionPosition(float x, float y):
// Sets a custom position for the description text in pixels on the screen.

// setDescriptionTypeface(Typeface t):
// Sets the Typeface used for drawing the description text.

// setDescriptionTextSize(float size):
// Sets the size of the description text in pixels, min 6f, max 16f.

// setNoDataText(String text):
// Sets the text that should appear if the chart is empty.

// setDrawGridBackground(boolean enabled):
// If enabled, the background rectangle behind the chart drawing-area will be drawn.

// setGridBackgroundColor(int color):
// Sets the color the grid-background should be drawn with.

// setDrawBorders(boolean enabled):
// Enables / disables drawing the chart borders (lines surrounding the chart).

// setBorderColor(int color):
// Sets the color of the chart border lines.

// setBorderWidth(float width):
// Sets the width of the chart border lines in dp.

// setMaxVisibleValueCount(int count):
// Sets the number of maximum visible drawn value-labels on the chart.
// This only takes affect when setDrawValues() is enabled.



    }
}
