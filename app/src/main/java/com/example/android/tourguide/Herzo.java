package com.example.android.tourguide;

/**
 * {@link Herzo} represents information about Herzogenaurach.
 * It contains a main and subcategory.
 */

public class Herzo {

    /**
     * Constant value that represents no image was provided for this category
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Main Category
     */
    private String mMainCategory;
    /**
     * Sub Category
     */
    private String mSubCategory;
    /**
     * Image resource ID for the category
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new Herzo object.
     *
     * @param SubCategory     is the subcategory
     * @param MainCategory    is main category
     * @param ImageResourceId is the drawable resource ID for the image associated with the categories
     */
    public Herzo(String SubCategory, String MainCategory, int ImageResourceId) {
        mSubCategory = SubCategory;
        mMainCategory = MainCategory;
        mImageResourceId = ImageResourceId;
    }

    /**
     * Get the subcategory of each main category.
     */
    public String getmSubCategory() {
        return mSubCategory;
    }

    /**
     * Get the main category of each main menu.
     */
    public String getmMainCategory() {
        return mMainCategory;
    }

    /**
     * Return the image resource ID of the category.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}