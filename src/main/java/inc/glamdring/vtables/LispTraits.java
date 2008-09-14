package inc.glamdring.vtables;

/**
 * User: jim
 * Date: Sep 14, 2008
 * Time: 2:31:31 AM
 */
enum LispTraits {
    isAny,isCons( ),


    isConsPair(isCons),
    isSequence(isCons),
    isVector(isSequence),
    isList(isSequence),
    isString(isList),
       isGuid,
    isHashtable,
    isHashtableIterator,
    isKeyhash,
    isLock,
    isSemaphore(isLock),
    isReadWriteLock(isLock),
    isOperator,
    isMacro(isOperator),
    isObject,
    isPackage,
    isProcess,
    isRegexPattern,
    isStream,
    isSocketStream(isStream),
    isBroadcastStream(isStream),
    isOutputBinaryStream(isStream),
    isOutputTextStream(isStream),
    isInOutBinaryStream(isStream),
    isInOutTextStream(isStream),
    isInputBinaryStream(isStream),
    isInputTextStream(isStream),
    isStruct(isCons),
    isSymbol,
    isSynonymStream(isStream),
    isNumber,
    isFloat(isNumber),
    isDouble(isNumber), isDoubleFloat(isNumber), isInteger(isNumber),
    isBoolean(isSymbol),
    isCharacter(isInteger),
    isChar(isInteger, isCharacter),
    isInt(isInteger),
    isLong(isInteger),
    isFunction,
    isCompiledFunction(isFunction),
    isNil(isBoolean),;

    final long caps;

    LispTraits(long caps) {
        this.caps = caps;
    }


    LispTraits(LispTraits... lineage) {
        int c = 1 << ordinal();
        caps = init(c, lineage);
    }

    private static long init(int c, LispTraits... lineage) {
        for (LispTraits lispTraits : lineage) {
            c |= lispTraits.caps;
        }
        return c;
    }
}
