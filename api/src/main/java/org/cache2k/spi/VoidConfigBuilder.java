package org.cache2k.spi;

/*
 * #%L
 * cache2k API only package
 * %%
 * Copyright (C) 2000 - 2014 headissue GmbH, Munich
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import org.cache2k.AnyBuilder;
import org.cache2k.RootAnyBuilder;

/**
 * A builder that actually does build nothing. Used for submodules which have no
 * extra configuration.
 *
 * @author Jens Wilke; created: 2014-06-21
 */
public class VoidConfigBuilder<R extends RootAnyBuilder<R,T>, T> implements AnyBuilder<R, T, Void> {

  private R root;

  public VoidConfigBuilder(R root) {
    this.root = root;
  }

  @Override
  public Void createConfiguration() {
    return null;
  }

  @Override
  public R root() {
    return root;
  }

  @Override
  public T build() {
    return root.build();
  }

}
