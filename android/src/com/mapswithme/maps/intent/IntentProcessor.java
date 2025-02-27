package com.mapswithme.maps.intent;

import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface IntentProcessor
{
  @Nullable
  MapTask process(@NonNull Intent intent);
}
