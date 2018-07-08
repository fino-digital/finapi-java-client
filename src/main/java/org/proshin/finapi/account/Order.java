/*
 * Copyright 2018 Roman Proshin
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
package org.proshin.finapi.account;

public enum Order {
    SEPA_MONEY_TRANSFER,
    SEPA_COLLECTIVE_MONEY_TRANSFER,
    SEPA_BASIC_DIRECT_DEBIT,
    SEPA_BASIC_COLLECTIVE_DIRECT_DEBIT,
    SEPA_B2B_DIRECT_DEBIT,
    SEPA_B2B_COLLECTIVE_DIRECT_DEBIT
}
