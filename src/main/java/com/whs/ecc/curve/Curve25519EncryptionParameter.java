/**
 * Copyright (C) 2015  Luca Zanconato (<luca.zanconato@nharyes.net>)
 *
 * This file is part of Secrete.
 *
 * Secrete is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Secrete is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Secrete.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.whs.ecc.curve;

import org.bouncycastle.crypto.params.KeyParameter;

import djb.Curve25519;

public class Curve25519EncryptionParameter extends KeyParameter {
	
	private byte[] scalarR;
	
	public Curve25519EncryptionParameter(byte[] publicKey, byte[] scalarR) {
		
		super(publicKey);
		
		if (publicKey.length != Curve25519.KEY_SIZE)
			throw new IllegalArgumentException("Wrong size for public key");
		
		if (scalarR.length != Curve25519.KEY_SIZE)
			throw new IllegalArgumentException("Wrong size for r");
		
		this.scalarR = scalarR;
	}

	public byte[] getScalarR() {
		
		return scalarR;
	}
}
