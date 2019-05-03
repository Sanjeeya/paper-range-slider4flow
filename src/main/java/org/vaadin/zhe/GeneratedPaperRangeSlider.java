/*
 * Copyright 2000-2018 Vaadin Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.vaadin.zhe;

import javax.annotation.Generated;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Synchronize;
import elemental.json.JsonObject;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.shared.Registration;
import com.vaadin.flow.component.Component;

@Generated({"Generator: com.vaadin.generator.ComponentGenerator#1.4-SNAPSHOT",
		"WebComponent: PaperRangeSlider#1.0.3", "Flow#1.4-SNAPSHOT"})
@Tag("paper-range-slider")
@HtmlImport("frontend://bower_components/paper-range-slider/paper-range-slider.html")
public abstract class GeneratedPaperRangeSlider<R extends GeneratedPaperRangeSlider<R>>
		extends
			Component implements HasStyle {

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * the width of the element in pixels.
	 * <p>
	 * This property is synchronized automatically from client side when a
	 * 'slider-width-changed' event happens.
	 * </p>
	 * 
	 * @return the {@code sliderWidth} property from the webcomponent
	 */
	@Synchronize(property = "sliderWidth", value = "slider-width-changed")
	protected String getSliderWidthString() {
		return getElement().getProperty("sliderWidth");
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * the width of the element in pixels.
	 * </p>
	 * 
	 * @param sliderWidth
	 *            the String value to set
	 */
	protected void setSliderWidth(String sliderWidth) {
		getElement().setProperty("sliderWidth",
				sliderWidth == null ? "" : sliderWidth);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * the style attribute of the element.
	 * <p>
	 * This property is synchronized automatically from client side when a
	 * 'main-div-style-changed' event happens.
	 * </p>
	 * 
	 * @return the {@code mainDivStyle} property from the webcomponent
	 */
	@Synchronize(property = "mainDivStyle", value = "main-div-style-changed")
	protected JsonObject getMainDivStyleJsonObject() {
		return (JsonObject) getElement().getPropertyRaw("mainDivStyle");
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * the style attribute of the element.
	 * </p>
	 * 
	 * @param mainDivStyle
	 *            the JsonObject value to set
	 */
	protected void setMainDivStyle(JsonObject mainDivStyle) {
		getElement().setPropertyJson("mainDivStyle", mainDivStyle);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * the minimal value (lower range) of the slider.
	 * 	 * <p>
	 * This property is synchronized automatically from client side when a
	 * 'min-changed' event happens.
	 * </p>
	 * 
	 * @return the {@code min} property from the webcomponent
	 */
	@Synchronize(property = "min", value = "min-changed")
	protected double getMinDouble() {
		return getElement().getProperty("min", 0.0);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * the minimal value (lower range) of the slider.
	 * </p>
	 * 
	 * @param min
	 *            the double value to set
	 */
	protected void setMin(double min) {
		getElement().setProperty("min", min);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * the maximal value (upper range) of the slider.
	 * <p>
	 * This property is synchronized automatically from client side when a
	 * 'max-changed' event happens.
	 * </p>
	 * 
	 * @return the {@code max} property from the webcomponent
	 */
	@Synchronize(property = "max", value = "max-changed")
	protected double getMaxDouble() {
		return getElement().getProperty("max", 0.0);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * the maximal value (upper range) of the slider.
	 * </p>
	 * 
	 * @param max
	 *            the double value to set
	 */
	protected void setMax(double max) {
		getElement().setProperty("max", max);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * the current value of the lower range of the slider.
	 * <p>
	 * This property is not synchronized automatically from the client side, so
	 * the returned value may not be the same as in client side.
	 * </p>
	 * 
	 * @return the {@code valueMin} property from the webcomponent
	 */
	protected double getValueMinDouble() {
		return getElement().getProperty("valueMin", 0.0);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * the current value of the lower range of the slider.
	 * </p>
	 * 
	 * @param valueMin
	 *            the double value to set
	 */
	protected void setValueMin(double valueMin) {
		getElement().setProperty("valueMin", valueMin);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * the current value of the upper range of the slider.
	 * <p>
	 * This property is not synchronized automatically from the client side, so
	 * the returned value may not be the same as in client side.
	 * </p>
	 * 
	 * @return the {@code valueMax} property from the webcomponent
	 */
	protected double getValueMaxDouble() {
		return getElement().getProperty("valueMax", 0.0);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * the current value of the upper range of the slider.
	 * </p>
	 * 
	 * @param valueMax
	 *            the double value to set
	 */
	protected void setValueMax(double valueMax) {
		getElement().setProperty("valueMax", valueMax);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * the minimal step-change of a knob on the slider
	 * <p>
	 * This property is synchronized automatically from client side when a
	 * 'step-changed' event happens.
	 * </p>
	 * 
	 * @return the {@code step} property from the webcomponent
	 */
	@Synchronize(property = "step", value = "step-changed")
	protected double getStepDouble() {
		return getElement().getProperty("step", 0.0);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * the minimal step-change of a knob on the slider
	 * </p>
	 * 
	 * @param step
	 *            the double value to set
	 */
	protected void setStep(double step) {
		getElement().setProperty("step", step);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
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
	@Synchronize(property = "valueDiffMin", value = "value-diff-min-changed")
	protected double getValueDiffMinDouble() {
		return getElement().getProperty("valueDiffMin", 0.0);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * optional minimal value for the difference between valueMin and valueMax
	 * by default this is negative (valueDiffMin is ignored)
	 * </p>
	 * 
	 * @param valueDiffMin
	 *            the double value to set
	 */
	protected void setValueDiffMin(double valueDiffMin) {
		getElement().setProperty("valueDiffMin", valueDiffMin);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
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
	@Synchronize(property = "valueDiffMax", value = "value-diff-max-changed")
	protected double getValueDiffMaxDouble() {
		return getElement().getProperty("valueDiffMax", 0.0);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * optional maximal value for the difference between valueMin and valueMax
	 * by default this is negative (valueDiffMax is ignored)
	 * </p>
	 * 
	 * @param valueDiffMax
	 *            the double value to set
	 */
	protected void setValueDiffMax(double valueDiffMax) {
		getElement().setProperty("valueDiffMax", valueDiffMax);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
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
	@Synchronize(property = "alwaysShowPin", value = "always-show-pin-changed")
	protected boolean isAlwaysShowPinBoolean() {
		return getElement().getProperty("alwaysShowPin", false);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * if true, pins with numeric value label are shown when the slider thumb is
	 * pressed. Use for settings for which users need to know the exact value of
	 * the setting.
	 * </p>
	 * 
	 * @param alwaysShowPin
	 *            the boolean value to set
	 */
	protected void setAlwaysShowPin(boolean alwaysShowPin) {
		getElement().setProperty("alwaysShowPin", alwaysShowPin);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
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
	@Synchronize(property = "pin", value = "pin-changed")
	protected boolean isPinBoolean() {
		return getElement().getProperty("pin", false);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * if true, pins with numeric value label are shown when the slider thumb is
	 * pressed. Use for settings for which users need to know the exact value of
	 * the setting.
	 * </p>
	 * 
	 * @param pin
	 *            the boolean value to set
	 */
	protected void setPin(boolean pin) {
		getElement().setProperty("pin", pin);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * if true, the slider thumb snaps to tick marks evenly spaced based on the
	 * {@code step} property value.
	 * <p>
	 * This property is synchronized automatically from client side when a
	 * 'snaps-changed' event happens.
	 * </p>
	 * 
	 * @return the {@code snaps} property from the webcomponent
	 */
	@Synchronize(property = "snaps", value = "snaps-changed")
	protected boolean isSnapsBoolean() {
		return getElement().getProperty("snaps", false);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * if true, the slider thumb snaps to tick marks evenly spaced based on the
	 * {@code step} property value.
	 * </p>
	 * 
	 * @param snaps
	 *            the boolean value to set
	 */
	protected void setSnaps(boolean snaps) {
		getElement().setProperty("snaps", snaps);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * if true, the slider is disabled.
	 * <p>
	 * This property is synchronized automatically from client side when a
	 * 'disabled-changed' event happens.
	 * </p>
	 * 
	 * @return the {@code disabled} property from the webcomponent
	 */
	@Synchronize(property = "disabled", value = "disabled-changed")
	protected boolean isDisabledBoolean() {
		return getElement().getProperty("disabled", false);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * if true, the slider is disabled.
	 * </p>
	 * 
	 * @param disabled
	 *            the boolean value to set
	 */
	protected void setDisabled(boolean disabled) {
		getElement().setProperty("disabled", disabled);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
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
	@Synchronize(property = "singleSlider", value = "single-slider-changed")
	protected boolean isSingleSliderBoolean() {
		return getElement().getProperty("singleSlider", false);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * an option to &quot;revert&quot; from the paper-range-slider to a single
	 * paper-single-range-slider.
	 * </p>
	 * 
	 * @param singleSlider
	 *            the boolean value to set
	 */
	protected void setSingleSlider(boolean singleSlider) {
		getElement().setProperty("singleSlider", singleSlider);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * time-window (in msec) to keep the slider._setTransiting(true) for the two
	 * paper-single-range-slider elements, when using the _setValuesTrans()
	 * method to change the selected range. This should be slightly higher than
	 * the transition time defined for the paper-single-range-slider (which, as
	 * of paper-single-range-slider-v1.0.11, is 0.08s/0.18s).
	 * <p>
	 * This property is not synchronized automatically from the client side, so
	 * the returned value may not be the same as in client side.
	 * </p>
	 * 
	 * @return the {@code transDuration} property from the webcomponent
	 */
	protected double getTransDurationDouble() {
		return getElement().getProperty("transDuration", 0.0);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * time-window (in msec) to keep the slider._setTransiting(true) for the two
	 * paper-single-range-slider elements, when using the _setValuesTrans()
	 * method to change the selected range. This should be slightly higher than
	 * the transition time defined for the paper-single-range-slider (which, as
	 * of paper-single-range-slider-v1.0.11, is 0.08s/0.18s).
	 * </p>
	 * 
	 * @param transDuration
	 *            the double value to set
	 */
	protected void setTransDuration(double transDuration) {
		getElement().setProperty("transDuration", transDuration);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * if set to true, tapping the slider below or above the selected range will
	 * update the selected range.
	 * <p>
	 * This property is synchronized automatically from client side when a
	 * 'tap-value-extend-changed' event happens.
	 * </p>
	 * 
	 * @return the {@code tapValueExtend} property from the webcomponent
	 */
	@Synchronize(property = "tapValueExtend", value = "tap-value-extend-changed")
	protected boolean isTapValueExtendBoolean() {
		return getElement().getProperty("tapValueExtend", false);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * if set to true, tapping the slider below or above the selected range will
	 * update the selected range.
	 * </p>
	 * 
	 * @param tapValueExtend
	 *            the boolean value to set
	 */
	protected void setTapValueExtend(boolean tapValueExtend) {
		getElement().setProperty("tapValueExtend", tapValueExtend);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * if set to true, tapping the slider inside the selected range will update
	 * the selected range.
	 * <p>
	 * This property is synchronized automatically from client side when a
	 * 'tap-value-reduce-changed' event happens.
	 * </p>
	 * 
	 * @return the {@code tapValueReduce} property from the webcomponent
	 */
	@Synchronize(property = "tapValueReduce", value = "tap-value-reduce-changed")
	protected boolean isTapValueReduceBoolean() {
		return getElement().getProperty("tapValueReduce", false);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * if set to true, tapping the slider inside the selected range will update
	 * the selected range.
	 * </p>
	 * 
	 * @param tapValueReduce
	 *            the boolean value to set
	 */
	protected void setTapValueReduce(boolean tapValueReduce) {
		getElement().setProperty("tapValueReduce", tapValueReduce);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * if set to true, tapping the slider will update the selected range, while
	 * keeping the same difference between valueMin and valueMax. tapValueMove
	 * supersedes tapValueExtend and tapValueReduce
	 * <p>
	 * This property is synchronized automatically from client side when a
	 * 'tap-value-move-changed' event happens.
	 * </p>
	 * 
	 * @return the {@code tapValueMove} property from the webcomponent
	 */
	@Synchronize(property = "tapValueMove", value = "tap-value-move-changed")
	protected boolean isTapValueMoveBoolean() {
		return getElement().getProperty("tapValueMove", false);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * if set to true, tapping the slider will update the selected range, while
	 * keeping the same difference between valueMin and valueMax. tapValueMove
	 * supersedes tapValueExtend and tapValueReduce
	 * </p>
	 * 
	 * @param tapValueMove
	 *            the boolean value to set
	 */
	protected void setTapValueMove(boolean tapValueMove) {
		getElement().setProperty("tapValueMove", tapValueMove);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * initialize basic properties (can be called again by the user)
	 * </p>
	 */
	protected void init() {
		getElement().callFunction("init");
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * set this.valueMin and/or this.valueMax (can input null values or
	 * out-of-range values in order to set only one of the two) - this is just a
	 * public wrapper for this._setValuesNoTrans(), but including transition
	 * animation
	 * </p>
	 * 
	 * @param valueMin
	 *            Missing documentation!
	 * @param valueMax
	 *            Missing documentation!
	 * @param eventName
	 *            Missing documentation!
	 */
	protected void setValues(JsonObject valueMin, JsonObject valueMax,
			JsonObject eventName) {
		getElement().callFunction("setValues", valueMin, valueMax, eventName);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * fire whenever this.valueMin or this.valueMax are changed
	 * </p>
	 * 
	 * @param eventName
	 *            Missing documentation!
	 */
	protected void updateValues(JsonObject eventName) {
		getElement().callFunction("updateValues", eventName);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * set the minimal value (lower range) of the slider
	 * </p>
	 * 
	 * @param minIn
	 *            Missing documentation!
	 */
	protected void setMin(JsonObject minIn) {
		getElement().callFunction("setMin", minIn);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * set the maximal value (upper range) of the slider
	 * </p>
	 * 
	 * @param maxIn
	 *            Missing documentation!
	 */
	protected void setMax(JsonObject maxIn) {
		getElement().callFunction("setMax", maxIn);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * set the minimal step-change of a knob on the slider
	 * </p>
	 * 
	 * @param stepIn
	 *            Missing documentation!
	 */
	protected void setStep(JsonObject stepIn) {
		getElement().callFunction("setStep", stepIn);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * get tne ratio (within [0,1]) corresponding to the min/max values
	 * </p>
	 */
	protected void getRatio() {
		getElement().callFunction("getRatio");
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * set the minimal difference between selected values
	 * </p>
	 * 
	 * @param valueDiffMin
	 *            Missing documentation!
	 */
	protected void setValueDiffMin(JsonObject valueDiffMin) {
		getElement().callFunction("setValueDiffMin", valueDiffMin);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * set the maximal difference between selected values
	 * </p>
	 * 
	 * @param valueDiffMax
	 *            Missing documentation!
	 */
	protected void setValueDiffMax(JsonObject valueDiffMax) {
		getElement().callFunction("setValueDiffMax", valueDiffMax);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * set the tapValueExtend property
	 * </p>
	 * 
	 * @param isTapValueExtend
	 *            Missing documentation!
	 */
	protected void setTapValueExtend(JsonObject isTapValueExtend) {
		getElement().callFunction("setTapValueExtend", isTapValueExtend);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * set the tapValueReduce property
	 * </p>
	 * 
	 * @param isTapValueReduce
	 *            Missing documentation!
	 */
	protected void setTapValueReduce(JsonObject isTapValueReduce) {
		getElement().callFunction("setTapValueReduce", isTapValueReduce);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * set the tapValueMove property
	 * </p>
	 * 
	 * @param isTapValueMove
	 *            Missing documentation!
	 */
	protected void setTapValueMove(JsonObject isTapValueMove) {
		getElement().callFunction("setTapValueMove", isTapValueMove);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * set the disabled parameter
	 * </p>
	 * 
	 * @param isDisabled
	 *            Missing documentation!
	 */
	protected void setDisabled(JsonObject isDisabled) {
		getElement().callFunction("setDisabled", isDisabled);
	}

	/**
	 * <p>
	 * Description copied from corresponding location in WebComponent:
	 * </p>
	 * <p>
	 * change the slider between the default paper-range-slider and a
	 * paper-single-range-slider
	 * </p>
	 * 
	 * @param isSingle
	 *            Missing documentation!
	 */
	protected void setSingleSlider(JsonObject isSingle) {
		getElement().callFunction("setSingleSlider", isSingle);
	}

	public static class SliderWidthChangeEvent<R extends GeneratedPaperRangeSlider<R>>
			extends
				ComponentEvent<R> {
		private final String sliderWidth;

		public SliderWidthChangeEvent(R source, boolean fromClient) {
			super(source, fromClient);
			this.sliderWidth = source.getSliderWidthString();
		}

		public String getSliderWidth() {
			return sliderWidth;
		}
	}

	/**
	 * Adds a listener for {@code slider-width-changed} events fired by the
	 * webcomponent.
	 * 
	 * @param listener
	 *            the listener
	 * @return a {@link Registration} for removing the event listener
	 */
	protected Registration addSliderWidthChangeListener(
			ComponentEventListener<SliderWidthChangeEvent<R>> listener) {
		return getElement().addPropertyChangeListener(
				"sliderWidth",
				event -> listener
						.onComponentEvent(new SliderWidthChangeEvent<R>(
								(R) this, event.isUserOriginated())));
	}

	public static class MainDivStyleChangeEvent<R extends GeneratedPaperRangeSlider<R>>
			extends
				ComponentEvent<R> {
		private final JsonObject mainDivStyle;

		public MainDivStyleChangeEvent(R source, boolean fromClient) {
			super(source, fromClient);
			this.mainDivStyle = source.getMainDivStyleJsonObject();
		}

		public JsonObject getMainDivStyle() {
			return mainDivStyle;
		}
	}

	/**
	 * Adds a listener for {@code main-div-style-changed} events fired by the
	 * webcomponent.
	 * 
	 * @param listener
	 *            the listener
	 * @return a {@link Registration} for removing the event listener
	 */
	protected Registration addMainDivStyleChangeListener(
			ComponentEventListener<MainDivStyleChangeEvent<R>> listener) {
		return getElement().addPropertyChangeListener(
				"mainDivStyle",
				event -> listener
						.onComponentEvent(new MainDivStyleChangeEvent<R>(
								(R) this, event.isUserOriginated())));
	}

	public static class MinChangeEvent<R extends GeneratedPaperRangeSlider<R>>
			extends
				ComponentEvent<R> {
		private final double min;

		public MinChangeEvent(R source, boolean fromClient) {
			super(source, fromClient);
			this.min = source.getMinDouble();
		}

		public double getMin() {
			return min;
		}
	}

	/**
	 * Adds a listener for {@code min-changed} events fired by the webcomponent.
	 * 
	 * @param listener
	 *            the listener
	 * @return a {@link Registration} for removing the event listener
	 */
	protected Registration addMinChangeListener(
			ComponentEventListener<MinChangeEvent<R>> listener) {
		return getElement().addPropertyChangeListener(
				"min",
				event -> listener.onComponentEvent(new MinChangeEvent<R>(
						(R) this, event.isUserOriginated())));
	}

	public static class MaxChangeEvent<R extends GeneratedPaperRangeSlider<R>>
			extends
				ComponentEvent<R> {
		private final double max;

		public MaxChangeEvent(R source, boolean fromClient) {
			super(source, fromClient);
			this.max = source.getMaxDouble();
		}

		public double getMax() {
			return max;
		}
	}

	/**
	 * Adds a listener for {@code max-changed} events fired by the webcomponent.
	 * 
	 * @param listener
	 *            the listener
	 * @return a {@link Registration} for removing the event listener
	 */
	protected Registration addMaxChangeListener(
			ComponentEventListener<MaxChangeEvent<R>> listener) {
		return getElement().addPropertyChangeListener(
				"max",
				event -> listener.onComponentEvent(new MaxChangeEvent<R>(
						(R) this, event.isUserOriginated())));
	}

	public static class StepChangeEvent<R extends GeneratedPaperRangeSlider<R>>
			extends
				ComponentEvent<R> {
		private final double step;

		public StepChangeEvent(R source, boolean fromClient) {
			super(source, fromClient);
			this.step = source.getStepDouble();
		}

		public double getStep() {
			return step;
		}
	}

	/**
	 * Adds a listener for {@code step-changed} events fired by the
	 * webcomponent.
	 * 
	 * @param listener
	 *            the listener
	 * @return a {@link Registration} for removing the event listener
	 */
	protected Registration addStepChangeListener(
			ComponentEventListener<StepChangeEvent<R>> listener) {
		return getElement().addPropertyChangeListener(
				"step",
				event -> listener.onComponentEvent(new StepChangeEvent<R>(
						(R) this, event.isUserOriginated())));
	}

	public static class ValueDiffMinChangeEvent<R extends GeneratedPaperRangeSlider<R>>
			extends
				ComponentEvent<R> {
		private final double valueDiffMin;

		public ValueDiffMinChangeEvent(R source, boolean fromClient) {
			super(source, fromClient);
			this.valueDiffMin = source.getValueDiffMinDouble();
		}

		public double getValueDiffMin() {
			return valueDiffMin;
		}
	}

	/**
	 * Adds a listener for {@code value-diff-min-changed} events fired by the
	 * webcomponent.
	 * 
	 * @param listener
	 *            the listener
	 * @return a {@link Registration} for removing the event listener
	 */
	protected Registration addValueDiffMinChangeListener(
			ComponentEventListener<ValueDiffMinChangeEvent<R>> listener) {
		return getElement().addPropertyChangeListener(
				"valueDiffMin",
				event -> listener
						.onComponentEvent(new ValueDiffMinChangeEvent<R>(
								(R) this, event.isUserOriginated())));
	}

	public static class ValueDiffMaxChangeEvent<R extends GeneratedPaperRangeSlider<R>>
			extends
				ComponentEvent<R> {
		private final double valueDiffMax;

		public ValueDiffMaxChangeEvent(R source, boolean fromClient) {
			super(source, fromClient);
			this.valueDiffMax = source.getValueDiffMaxDouble();
		}

		public double getValueDiffMax() {
			return valueDiffMax;
		}
	}

	/**
	 * Adds a listener for {@code value-diff-max-changed} events fired by the
	 * webcomponent.
	 * 
	 * @param listener
	 *            the listener
	 * @return a {@link Registration} for removing the event listener
	 */
	protected Registration addValueDiffMaxChangeListener(
			ComponentEventListener<ValueDiffMaxChangeEvent<R>> listener) {
		return getElement().addPropertyChangeListener(
				"valueDiffMax",
				event -> listener
						.onComponentEvent(new ValueDiffMaxChangeEvent<R>(
								(R) this, event.isUserOriginated())));
	}

	public static class AlwaysShowPinChangeEvent<R extends GeneratedPaperRangeSlider<R>>
			extends
				ComponentEvent<R> {
		private final boolean alwaysShowPin;

		public AlwaysShowPinChangeEvent(R source, boolean fromClient) {
			super(source, fromClient);
			this.alwaysShowPin = source.isAlwaysShowPinBoolean();
		}

		public boolean isAlwaysShowPin() {
			return alwaysShowPin;
		}
	}

	/**
	 * Adds a listener for {@code always-show-pin-changed} events fired by the
	 * webcomponent.
	 * 
	 * @param listener
	 *            the listener
	 * @return a {@link Registration} for removing the event listener
	 */
	protected Registration addAlwaysShowPinChangeListener(
			ComponentEventListener<AlwaysShowPinChangeEvent<R>> listener) {
		return getElement().addPropertyChangeListener(
				"alwaysShowPin",
				event -> listener
						.onComponentEvent(new AlwaysShowPinChangeEvent<R>(
								(R) this, event.isUserOriginated())));
	}

	public static class PinChangeEvent<R extends GeneratedPaperRangeSlider<R>>
			extends
				ComponentEvent<R> {
		private final boolean pin;

		public PinChangeEvent(R source, boolean fromClient) {
			super(source, fromClient);
			this.pin = source.isPinBoolean();
		}

		public boolean isPin() {
			return pin;
		}
	}

	/**
	 * Adds a listener for {@code pin-changed} events fired by the webcomponent.
	 * 
	 * @param listener
	 *            the listener
	 * @return a {@link Registration} for removing the event listener
	 */
	protected Registration addPinChangeListener(
			ComponentEventListener<PinChangeEvent<R>> listener) {
		return getElement().addPropertyChangeListener(
				"pin",
				event -> listener.onComponentEvent(new PinChangeEvent<R>(
						(R) this, event.isUserOriginated())));
	}

	public static class SnapsChangeEvent<R extends GeneratedPaperRangeSlider<R>>
			extends
				ComponentEvent<R> {
		private final boolean snaps;

		public SnapsChangeEvent(R source, boolean fromClient) {
			super(source, fromClient);
			this.snaps = source.isSnapsBoolean();
		}

		public boolean isSnaps() {
			return snaps;
		}
	}

	/**
	 * Adds a listener for {@code snaps-changed} events fired by the
	 * webcomponent.
	 * 
	 * @param listener
	 *            the listener
	 * @return a {@link Registration} for removing the event listener
	 */
	protected Registration addSnapsChangeListener(
			ComponentEventListener<SnapsChangeEvent<R>> listener) {
		return getElement().addPropertyChangeListener(
				"snaps",
				event -> listener.onComponentEvent(new SnapsChangeEvent<R>(
						(R) this, event.isUserOriginated())));
	}

	public static class DisabledChangeEvent<R extends GeneratedPaperRangeSlider<R>>
			extends
				ComponentEvent<R> {
		private final boolean disabled;

		public DisabledChangeEvent(R source, boolean fromClient) {
			super(source, fromClient);
			this.disabled = source.isDisabledBoolean();
		}

		public boolean isDisabled() {
			return disabled;
		}
	}

	/**
	 * Adds a listener for {@code disabled-changed} events fired by the
	 * webcomponent.
	 * 
	 * @param listener
	 *            the listener
	 * @return a {@link Registration} for removing the event listener
	 */
	protected Registration addDisabledChangeListener(
			ComponentEventListener<DisabledChangeEvent<R>> listener) {
		return getElement().addPropertyChangeListener(
				"disabled",
				event -> listener.onComponentEvent(new DisabledChangeEvent<R>(
						(R) this, event.isUserOriginated())));
	}

	public static class SingleSliderChangeEvent<R extends GeneratedPaperRangeSlider<R>>
			extends
				ComponentEvent<R> {
		private final boolean singleSlider;

		public SingleSliderChangeEvent(R source, boolean fromClient) {
			super(source, fromClient);
			this.singleSlider = source.isSingleSliderBoolean();
		}

		public boolean isSingleSlider() {
			return singleSlider;
		}
	}

	/**
	 * Adds a listener for {@code single-slider-changed} events fired by the
	 * webcomponent.
	 * 
	 * @param listener
	 *            the listener
	 * @return a {@link Registration} for removing the event listener
	 */
	protected Registration addSingleSliderChangeListener(
			ComponentEventListener<SingleSliderChangeEvent<R>> listener) {
		return getElement().addPropertyChangeListener(
				"singleSlider",
				event -> listener
						.onComponentEvent(new SingleSliderChangeEvent<R>(
								(R) this, event.isUserOriginated())));
	}

	public static class TapValueExtendChangeEvent<R extends GeneratedPaperRangeSlider<R>>
			extends
				ComponentEvent<R> {
		private final boolean tapValueExtend;

		public TapValueExtendChangeEvent(R source, boolean fromClient) {
			super(source, fromClient);
			this.tapValueExtend = source.isTapValueExtendBoolean();
		}

		public boolean isTapValueExtend() {
			return tapValueExtend;
		}
	}

	/**
	 * Adds a listener for {@code tap-value-extend-changed} events fired by the
	 * webcomponent.
	 * 
	 * @param listener
	 *            the listener
	 * @return a {@link Registration} for removing the event listener
	 */
	protected Registration addTapValueExtendChangeListener(
			ComponentEventListener<TapValueExtendChangeEvent<R>> listener) {
		return getElement().addPropertyChangeListener(
				"tapValueExtend",
				event -> listener
						.onComponentEvent(new TapValueExtendChangeEvent<R>(
								(R) this, event.isUserOriginated())));
	}

	public static class TapValueReduceChangeEvent<R extends GeneratedPaperRangeSlider<R>>
			extends
				ComponentEvent<R> {
		private final boolean tapValueReduce;

		public TapValueReduceChangeEvent(R source, boolean fromClient) {
			super(source, fromClient);
			this.tapValueReduce = source.isTapValueReduceBoolean();
		}

		public boolean isTapValueReduce() {
			return tapValueReduce;
		}
	}

	/**
	 * Adds a listener for {@code tap-value-reduce-changed} events fired by the
	 * webcomponent.
	 * 
	 * @param listener
	 *            the listener
	 * @return a {@link Registration} for removing the event listener
	 */
	protected Registration addTapValueReduceChangeListener(
			ComponentEventListener<TapValueReduceChangeEvent<R>> listener) {
		return getElement().addPropertyChangeListener(
				"tapValueReduce",
				event -> listener
						.onComponentEvent(new TapValueReduceChangeEvent<R>(
								(R) this, event.isUserOriginated())));
	}

	public static class TapValueMoveChangeEvent<R extends GeneratedPaperRangeSlider<R>>
			extends
				ComponentEvent<R> {
		private final boolean tapValueMove;

		public TapValueMoveChangeEvent(R source, boolean fromClient) {
			super(source, fromClient);
			this.tapValueMove = source.isTapValueMoveBoolean();
		}

		public boolean isTapValueMove() {
			return tapValueMove;
		}
	}

	/**
	 * Adds a listener for {@code tap-value-move-changed} events fired by the
	 * webcomponent.
	 * 
	 * @param listener
	 *            the listener
	 * @return a {@link Registration} for removing the event listener
	 */
	protected Registration addTapValueMoveChangeListener(
			ComponentEventListener<TapValueMoveChangeEvent<R>> listener) {
		return getElement().addPropertyChangeListener(
				"tapValueMove",
				event -> listener
						.onComponentEvent(new TapValueMoveChangeEvent<R>(
								(R) this, event.isUserOriginated())));
	}
}