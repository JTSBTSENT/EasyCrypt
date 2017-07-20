/**
 * Copyright 2017 Priyank Vasa
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pvryan.easycrypt.randomorg

import com.google.gson.JsonArray

/**
 * Response structure from api.random.org
 */
data class RandomOrgResponse(
        val jsonrpc: String,
        val error: Error?,
        val result: Result,
        val id: Int
) {
    data class Error(
            val code: Int,
            val message: String
    )

    data class Result(
            val random: Random,
            val bitsUsed: Long,
            val bitsLeft: Long,
            val requestsLeft: Int
    ) {
        data class Random(
                val data: JsonArray
        )
    }
}