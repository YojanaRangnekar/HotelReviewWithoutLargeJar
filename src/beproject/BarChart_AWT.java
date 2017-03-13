/**
 * 
 */

/**
 * @author Admin
 *
 */

package beproject;

import java.awt.Font;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class BarChart_AWT extends ApplicationFrame
{
    public BarChart_AWT(String applicationTitle, String chartTitle, String[] features, double[] result, int n)
    {
        super(applicationTitle);
        JFreeChart barChart = ChartFactory.createBarChart(
                chartTitle,
                "Features",
                "Score",
                createDataset(features, result, n),
                PlotOrientation.VERTICAL,
                true, true, false);

        Font f = new Font("abc", Font.ITALIC, 30);
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        chartPanel.setFont(f);
        setContentPane(chartPanel);
    }

    public CategoryDataset createDataset(String[] features, double[] result, int n)
    {

        final DefaultCategoryDataset dataset =
                                               new DefaultCategoryDataset();

        // String restaurants[] = {"Poptates","Blue Frog","Candies","Wild Dining"};
        for (int i = 0; i < 4; i++)
        {
            if (result[i] != 0.0)
                result[i] = 1 + result[i];

            result[i] *= 100;
            System.out.println("result[i] " + result[i]);
            if (n == 0)
                dataset.addValue(result[i], "", features[i]);
            else
                dataset.addValue(result[i], "", features[i]);
            //dataset.addValue(0.0,"","");
        }

        return dataset;
    }

}
