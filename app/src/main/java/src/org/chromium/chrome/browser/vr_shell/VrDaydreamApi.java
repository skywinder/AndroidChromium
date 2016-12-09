// Copyright 2016 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.vr_shell;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;

/**
 * Abstract away DaydreamImpl class, which may or may not be present at runtime depending on compile
 * flags.
 */
public interface VrDaydreamApi {
    /**
     * Register the intent to launch after phone inserted into a Daydream viewer.
     */
    void registerDaydreamIntent(final PendingIntent pendingIntent);

    /**
     * Unregister the intent if any.
     */
    void unregisterDaydreamIntent();

    /**
     * Create an Intent to launch a VR activity with the given component name.
     */
    Intent createVrIntent(final ComponentName componentName);

    /**
     * Launch the given Intent in VR mode.
     */
    void launchInVr(final PendingIntent pendingIntent);

    /**
     * @param requestCode The requestCode used by startActivityForResult.
     * @param intent The data passed to VrCore as part of the exit request.
     */
    void exitFromVr(int requestCode, final Intent intent);

    /**
     * Sets VR Mode to |enabled|.
     */
    void setVrModeEnabled(boolean enabled);
}
