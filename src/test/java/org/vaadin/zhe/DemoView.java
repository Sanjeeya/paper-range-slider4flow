package org.vaadin.zhe;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    private VerticalLayout vl= new VerticalLayout();

    public DemoView() {
        add(vl);
        defaultSlider();
        customizedSlider();
        pinShownSlider();
        disabledSlider();
        singleSlider();
        sliderWithEvent();

    }

    private void defaultSlider() {
        PaperRangeSlider paperRangeSlider = new PaperRangeSlider();
        vl.add(new Label("Default Slider"), paperRangeSlider);
    }

    private void customizedSlider(){
        PaperRangeSlider paperRangeSlider = new PaperRangeSlider(-100, 100, -50, 50);
        vl.add(new Label("Customized Slider"), paperRangeSlider);
    }

    private void pinShownSlider() {
        PaperRangeSlider paperRangeSlider = new PaperRangeSlider(-50.5, 23.5, -50, 0.5, true);
        paperRangeSlider.setStep(0.5);
        vl.add(new Label("Slider with customized step and pin show option"), paperRangeSlider);
    }

    private void disabledSlider(){
        PaperRangeSlider paperRangeSlider = new PaperRangeSlider();
        paperRangeSlider.setEnabled(false);
        vl.add(new Label("Disabled Slider"), paperRangeSlider);
    }

    private void singleSlider(){
        PaperRangeSlider paperRangeSlider = new PaperRangeSlider();
        paperRangeSlider.setSingleSlider(true);
        vl.add(new Label("Converted to Single Slider"), paperRangeSlider);
    }

    private void sliderWithEvent(){
        PaperRangeSlider paperRangeSlider = new PaperRangeSlider(-100, 100, -50, 50);
        Label lowerValueLabel = new Label("Initial lower value is " + paperRangeSlider.getValueMin());
        Label upperValueLabel = new Label("Initial upper value is "+ paperRangeSlider.getValueMax());
        paperRangeSlider.addMinValueChangeListener(event -> lowerValueLabel.setText("Current lower value is " + event.getValueMin()));
        paperRangeSlider.addMaxValueChangeListener(event -> upperValueLabel.setText("Current upper value is " + event.getValueMax()));
        vl.add(new Label("Customized Slider"), lowerValueLabel, upperValueLabel, paperRangeSlider);
    }

}
