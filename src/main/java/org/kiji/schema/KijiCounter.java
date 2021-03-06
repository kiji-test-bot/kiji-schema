/**
 * (c) Copyright 2012 WibiData, Inc.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kiji.schema;

/**
 * A counter value stored in a column of a Kiji table.
 *
 * <p>Use a {@link KijiTableWriter} to increment a counter value.</p>
 *
 * @see KijiTableWriter#increment(EntityId, String, String, long)
 */
public interface KijiCounter {
  /**
   * Gets the timestamp at which the counter was incremented.
   *
   * @return A timestamp, in milliseconds since the epoch.
   */
  long getTimestamp();

  /**
   * Gets the value of the counter.
   *
   * @return The value of the counter, which is zero if the counter has never been incremented.
   */
  long getValue();
}
