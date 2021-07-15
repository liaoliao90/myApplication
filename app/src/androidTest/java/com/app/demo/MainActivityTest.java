package com.app.demo;


import android.support.test.espresso.DataInteraction;
import android.support.test.espresso.ViewInteraction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btn_create_account), withText("Create a Profile"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.login_frm_content),
                                        0),
                                4),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.edt_first_name),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.login_frm_content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(replaceText("T"), closeSoftKeyboard());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.edt_last_name),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.login_frm_content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("A"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.edt_country),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.login_frm_content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("S"), closeSoftKeyboard());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.edt_username),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.login_frm_content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatEditText4.perform(replaceText("test"), closeSoftKeyboard());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.edt_password),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.login_frm_content),
                                        0),
                                4),
                        isDisplayed()));
        appCompatEditText5.perform(replaceText("123"), closeSoftKeyboard());

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.edt_password_confirm),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.login_frm_content),
                                        0),
                                5),
                        isDisplayed()));
        appCompatEditText6.perform(replaceText("123"), closeSoftKeyboard());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.btn_create_account), withText("Create Profile"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.login_frm_content),
                                        0),
                                6),
                        isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.btn_login), withText("Login"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.login_frm_content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.btn_add_account), withText("Add Account"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.flContent),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction appCompatEditText7 = onView(
                allOf(withId(R.id.edt_payee_name),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText7.perform(replaceText("rr"), closeSoftKeyboard());

        ViewInteraction appCompatEditText8 = onView(
                allOf(withId(R.id.edt_init_bal),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatEditText8.perform(replaceText("100"), closeSoftKeyboard());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.btn_add_payee), withText("ADD"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        appCompatButton5.perform(click());

        ViewInteraction floatingActionButton = onView(
                allOf(withId(R.id.floating_action_btn),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.flContent),
                                        0),
                                3),
                        isDisplayed()));
        floatingActionButton.perform(click());

        ViewInteraction appCompatEditText9 = onView(
                allOf(withId(R.id.edt_payee_name),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText9.perform(replaceText("zz"), closeSoftKeyboard());

        ViewInteraction appCompatEditText10 = onView(
                allOf(withId(R.id.edt_init_bal),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatEditText10.perform(replaceText("80"), closeSoftKeyboard());

        ViewInteraction appCompatButton6 = onView(
                allOf(withId(R.id.btn_add_payee), withText("ADD"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        appCompatButton6.perform(click());

        ViewInteraction appCompatImageButton = onView(
                allOf(withContentDescription("Open navigation drawer"),
                        childAtPosition(
                                allOf(withId(R.id.toolbar),
                                        childAtPosition(
                                                withClassName(is("android.support.design.widget.AppBarLayout")),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatImageButton.perform(click());

        ViewInteraction navigationMenuItemView = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.design_navigation_view),
                                childAtPosition(
                                        withId(R.id.nav_view),
                                        0)),
                        5),
                        isDisplayed()));
        navigationMenuItemView.perform(click());

        ViewInteraction appCompatEditText11 = onView(
                allOf(withId(R.id.edt_deposit_amount),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatEditText11.perform(replaceText("10"), closeSoftKeyboard());

        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.btn_deposit), withText("DEPOSIT"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton7.perform(click());

        ViewInteraction appCompatImageButton2 = onView(
                allOf(withContentDescription("Open navigation drawer"),
                        childAtPosition(
                                allOf(withId(R.id.toolbar),
                                        childAtPosition(
                                                withClassName(is("android.support.design.widget.AppBarLayout")),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatImageButton2.perform(click());

        ViewInteraction navigationMenuItemView2 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.design_navigation_view),
                                childAtPosition(
                                        withId(R.id.nav_view),
                                        0)),
                        6),
                        isDisplayed()));
        navigationMenuItemView2.perform(click());

        ViewInteraction appCompatEditText12 = onView(
                allOf(withId(R.id.edt_transfer_amount),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.flContent),
                                        0),
                                2),
                        isDisplayed()));
        appCompatEditText12.perform(replaceText("50"), closeSoftKeyboard());

        ViewInteraction appCompatButton8 = onView(
                allOf(withId(R.id.btn_confirm_transfer), withText("Confirm Transfer"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.flContent),
                                        0),
                                5),
                        isDisplayed()));
        appCompatButton8.perform(click());

        ViewInteraction appCompatSpinner = onView(
                allOf(withId(R.id.spn_select_sending_acc),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.flContent),
                                        0),
                                1),
                        isDisplayed()));
        appCompatSpinner.perform(click());

        DataInteraction appCompatCheckedTextView = onData(anything())
                .inAdapterView(childAtPosition(
                        withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                        0))
                .atPosition(1);
        appCompatCheckedTextView.perform(click());

        ViewInteraction appCompatSpinner2 = onView(
                allOf(withId(R.id.spn_select_receiving_acc),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.flContent),
                                        0),
                                4),
                        isDisplayed()));
        appCompatSpinner2.perform(click());

        DataInteraction appCompatCheckedTextView2 = onData(anything())
                .inAdapterView(childAtPosition(
                        withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                        0))
                .atPosition(0);
        appCompatCheckedTextView2.perform(click());

        ViewInteraction appCompatEditText13 = onView(
                allOf(withId(R.id.edt_transfer_amount), withText("50"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.flContent),
                                        0),
                                2),
                        isDisplayed()));
        appCompatEditText13.perform(replaceText("12"));

        ViewInteraction appCompatEditText14 = onView(
                allOf(withId(R.id.edt_transfer_amount), withText("12"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.flContent),
                                        0),
                                2),
                        isDisplayed()));
        appCompatEditText14.perform(closeSoftKeyboard());

        ViewInteraction appCompatButton9 = onView(
                allOf(withId(R.id.btn_confirm_transfer), withText("Confirm Transfer"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.flContent),
                                        0),
                                5),
                        isDisplayed()));
        appCompatButton9.perform(click());

        ViewInteraction appCompatImageButton3 = onView(
                allOf(withContentDescription("Open navigation drawer"),
                        childAtPosition(
                                allOf(withId(R.id.toolbar),
                                        childAtPosition(
                                                withClassName(is("android.support.design.widget.AppBarLayout")),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatImageButton3.perform(click());

        ViewInteraction navigationMenuItemView3 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.design_navigation_view),
                                childAtPosition(
                                        withId(R.id.nav_view),
                                        0)),
                        2),
                        isDisplayed()));
        navigationMenuItemView3.perform(click());

        DataInteraction constraintLayout = onData(anything())
                .inAdapterView(allOf(withId(R.id.lst_accounts),
                        childAtPosition(
                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                2)))
                .atPosition(0);
        constraintLayout.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
