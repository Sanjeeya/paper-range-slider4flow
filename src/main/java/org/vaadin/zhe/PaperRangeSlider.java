package org.vaadin.zhe;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import com.vaadin.flow.component.HasEnabled;
import com.vaadin.flow.component.Synchronize;
import com.vaadin.flow.shared.Registration;

public class PaperRangeSlider extends GeneratedPaperRangeSlider<PaperRangeSlider> implements HasEnabled {

    /**
     * Create a default PaperRangeSlider with range 0-100 without pin shown
     */
    public PaperRangeSlider() {
    }

    /**
     * Create a PaperRangeSlider with customized range and value with pin shown on click
     *
     * @param min
     *              the lower range of the slider
     * @param max
     *              the upper range of the slider
     * @param valueMin
     *              the initial value of the lower range of the slider
     * @param valueMax
     *              the initial value of the upper range of the slider
     */
    public PaperRangeSlider(double min, double max, double valueMin, double valueMax){
        this();
        setMin(min);
        setMax(max);
        setValueMin(valueMin);
        setValueMax(valueMax);
        setPinOnClick(true);
    }

    /**
     * Create a PaperRangeSlider with customized range, value and pin shown options
     *
     * @param min
     *              the lower range of the slider
     * @param max
     *              the upper range of the slider
     * @param valueMin
     *              the initial value of the lower range of the slider
     * @param valueMax
     *              the initial value of the upper range of the slider
     * @param alwaysShowPin
     *              if true, the pin will be shown always;
     *              if false, the pin will not be shown
     */
    public PaperRangeSlider(double min, double max, double valueMin, double valueMax, boolean alwaysShowPin){
        this();
        setMin(min);
        setMax(max);
        setValueMin(valueMin);
        setValueMax(valueMax);
        setAlwaysShowPin(alwaysShowPin);
    }

    @Override
    public void setMin(double min) {
        super.setMin(min);
    }

    /**
     * <p>
     *  the minimal value (lower range) of the slider.
     * <p>
     * This property is synchronized automatically from client side when a
     * 'min-changed' event happens.
     * </p>
     *
     * @return the {@code min} property from the webcomponent
     *
     */
    public double getMin() {
        return getMinDouble();
    }

    @Override
    public void setValueMin(double valueMin) {
        super.setValueMin(valueMin);
    }

    /**
     * <p>
     * the current value of the lower range of the slider.
     * <p>
     * This property is not synchronized automatically from the client side, so
     * the returned value may not be the same as in client side.
     * </p>
     *
     * @return the {@code valueMin} property from the webcomponent
     */
    public double getValueMin() {
        return getValueMinDouble();
    }

    @Override
    public void setMax(double max) {
        super.setMax(max);
    }

    /**
     * <p>
     * the maximal value (upper range) of the slider.
     * <p>
     * This property is synchronized automatically from client side when a
     * 'max-changed' event happens.
     * </p>
     *
     * @return the {@code max} property from the webcomponent
     */
    public double getMax() {
        return getMaxDouble();
    }

    @Override
    public void setValueMax(double valueMax) {
        super.setValueMax(valueMax);
    }

    /**
     * <p>
     * the current value of the upper range of the slider.
     * <p>
     * This property is not synchronized automatically from the client side, so
     * the returned value may not be the same as in client side.
     * </p>
     *
     * @return the {@code valueMax} property from the webcomponent
     */
    public double getValueMax() {
        return getValueMaxDouble();
    }

    @Override
    public void setStep(double step) {
        super.setStep(step);
    }

    /**
     * <p>
     * the minimal step-change of a knob on the slider
     * <p>
     * This property is synchronized automatically from client side when a
     * 'step-changed' event happens.
     * </p>
     *
     * @return the {@code step} property from the webcomponent
     */
    public double getStep() {
        return getStepDouble();
    }

    @Override
    public void setValueDiffMax(double valueDiffMax) {
        super.setValueDiffMax(valueDiffMax);
    }

    /**
     * <p>
     * optional maximal value for the difference between valueMin and valueMax
     * by default this is negative (valueDiffMax is ignored)
     * <p>
     * This property is synchronized automatically from client side when a
     * 'value-diff-max-changed' event happens.
     * </p>
     *
     * @return the {@code valueDiffMax} property from the webcomponent
     */
    public double getValueDiffMax() {
        return super.getValueDiffMaxDouble();
    }

    @Override
    public void setValueDiffMin(double valueDiffMin) {
        super.setValueDiffMin(valueDiffMin);
    }

    /**
     * <p>
     * optional minimal value for the difference between valueMin and valueMax
     * by default this is negative (valueDiffMin is ignored)
     * <p>
     * This property is synchronized automatically from client side when a
     * 'value-diff-min-changed' event happens.
     * </p>
     *
     * @return the {@code valueDiffMin} property from the webcomponent
     */
    public double getValueDiffMin() {
        return getValueDiffMinDouble();
    }

    /**
     * <p>
     * if true, pins with numeric value label are shown when the slider thumb is
     * pressed. Use for settings for which users need to know the exact value of
     * the setting.
     * </p>
     *
     * @param pin
     *            the boolean value to set
     */
    public void setPinOnClick(boolean pin) {
        setPin(pin);
    }

    /**
     * <p>
     * if true, pins with numeric value label are shown when the slider thumb is
     * pressed. Use for settings for which users need to know the exact value of
     * the setting.
     * <p>
     * This property is synchronized automatically from client side when a
     * 'pin-changed' event happens.
     * </p>
     *
     * @return the {@code pin} property from the webcomponent
     */
    public boolean isPinOnClick() {
        return isPinBoolean();
    }

    @Override
    public void setAlwaysShowPin(boolean alwaysShowPin) {
        super.setAlwaysShowPin(alwaysShowPin);
    }

    /**
     * <p>
     * if true, pins with numeric value label are shown when the slider thumb is
     * pressed. Use for settings for which users need to know the exact value of
     * the setting.
     * <p>
     * This property is synchronized automatically from client side when a
     * 'always-show-pin-changed' event happens.
     * </p>
     *
     * @return the {@code alwaysShowPin} property from the webcomponent
     */
    public boolean isAlwaysShowPin() {
        return isAlwaysShowPinBoolean();
    }

    @Override
    public void setSingleSlider(boolean singleSlider) {
        super.setSingleSlider(singleSlider);
    }

    /**
     * <p>
     * an option to &quot;revert&quot; from the paper-range-slider to a single
     * paper-single-range-slider.
     * <p>
     * This property is synchronized automatically from client side when a
     * 'single-slider-changed' event happens.
     * </p>
     *
     * @return the {@code singleSlider} property from the webcomponent
     */
    public boolean isSingleSlider() {
        return isSingleSliderBoolean();
    }

    public Registration addMinValueChangeListener(
            ComponentEventListener<MinValueChangeEvent> listener) {
        return addListener(MinValueChangeEvent.class, listener);
    }

    @DomEvent("value-min-changed")
    public static class MinValueChangeEvent extends ComponentEvent<PaperRangeSlider> {
        private double min;

        public MinValueChangeEvent(PaperRangeSlider source, boolean fromClient,
                                   @EventData("event.detail.value") double valueMin) {
            super(source, fromClient);
            this.min = valueMin;
        }

        public double getValueMin(){
            return min;
        }
    }

    public Registration addMaxValueChangeListener(
            ComponentEventListener<MaxValueChangeEvent> listener) {
        return addListener(MaxValueChangeEvent.class, listener);
    }

    @DomEvent("value-max-changed")
    public static class MaxValueChangeEvent extends ComponentEvent<PaperRangeSlider> {
        private double max;

        public MaxValueChangeEvent(PaperRangeSlider source, boolean fromClient,
                                   @EventData("event.detail.value") double valueMax) {
            super(source, fromClient);
            this.max = valueMax;
        }

        public double getValueMax(){
            return max;
        }
    }
}
