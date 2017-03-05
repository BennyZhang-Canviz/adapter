/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pacific.adapter;

import java.util.List;

public abstract class SimpleRecyclerItem implements RecyclerItem<ViewHolder> {

    @Override
    public void bindPayloads(ViewHolder holder, List<Object> payloads) {
    }

    @Override
    public int getSpanSize(int spanCount, int position) {
        return spanCount;
    }

    @Override
    public void unbind(ViewHolder holder) {
    }

    @Override
    public void onViewAttachedToWindow(ViewHolder holder) {
    }

    @Override
    public void onViewDetachedFromWindow(ViewHolder holder) {
    }

    @Override
    public boolean isRecyclable() {
        return true;
    }

    @Override
    public long diffId() {
        return ID_COUNTER.decrementAndGet();
    }

    @Override
    public int getViewType() {
        return 0;
    }
}
