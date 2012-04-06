package org.grails.plugin.platform.conventions

/**
 * Encapsulate a DSL command that represents a nested block of commands
 *
 * something {
 *    other = foo   
 *    bar a:b
 * }
 * -or with arguments-
 *
 * something(a, b) {
 *    other = foo   
 *    bar a:b
 * }
 */
class DSLBlockCommand extends DSLCallCommand {
    List<DSLCommand> children
}