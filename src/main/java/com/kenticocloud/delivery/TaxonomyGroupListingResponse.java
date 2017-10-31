/*
 * MIT License
 *
 * Copyright (c) 2017
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.kenticocloud.delivery;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TaxonomyGroupListingResponse {

    @JsonProperty("taxonomies")
    List<TaxonomyGroup> taxonomies;

    @JsonProperty("pagination")
    Pagination pagination;

    /**
     * A list of taxonomy groups
     * @return list of {@link TaxonomyGroup}
     */
    public List<TaxonomyGroup> getTaxonomies() {
        return taxonomies;
    }

    public void setTaxonomies(List<TaxonomyGroup> taxonomies) {
        this.taxonomies = taxonomies;
    }

    /**
     * Information about the retrieved page
     * @return the {@link Pagination} object identifying the current page
     */
    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}