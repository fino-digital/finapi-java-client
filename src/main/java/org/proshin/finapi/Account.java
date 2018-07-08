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
package org.proshin.finapi;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.proshin.finapi.account.ClearingAccount;
import org.proshin.finapi.account.DirectDebit;
import org.proshin.finapi.account.EditParameters;
import org.proshin.finapi.account.Holder;
import org.proshin.finapi.account.MoneyTransfer;
import org.proshin.finapi.account.Order;
import org.proshin.finapi.account.Status;
import org.proshin.finapi.account.Type;

public interface Account {

    Long id();

    BankConnection bankConnection();

    Optional<String> name();

    Optional<String> number();

    Optional<String> subNumber();

    Optional<String> iban();

    Holder holder();

    Optional<String> currency();

    Type type();

    Optional<BigDecimal> balance();

    Optional<BigDecimal> overdraft();

    Optional<BigDecimal> overdraftLimit();

    Optional<BigDecimal> availableFunds();

    Optional<OffsetDateTime> lastSuccessfulUpdate();

    Optional<OffsetDateTime> lastUpdateAttempt();

    boolean isNew();

    Status status();

    Iterable<Order> supportedOrders();

    Iterable<ClearingAccount> clearingAccounts();

    void edit(EditParameters parameters);

    MoneyTransfer moneyTransfer();

    DirectDebit directDebit();

    void delete(Long id);
}
